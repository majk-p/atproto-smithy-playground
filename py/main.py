import os
import json
import argparse
from typing import Dict, Any, List

def convert_atproto_type_to_smithy(atproto_type: str, nested: bool = False) -> str:
    """
    Convert ATP types to Smithy types with more robust type mapping
    """
    type_mapping = {
        'string': 'String',
        'integer': 'Integer',
        'boolean': 'Boolean',
        'float': 'Float',
        'bytes': 'Blob',
        'json': 'Document',
        'unknown': 'Document'
    }
    
    # Handle array types
    if isinstance(atproto_type, dict):
        if atproto_type.get('type') == 'array':
            item_type = convert_atproto_type_to_smithy(atproto_type.get('items', 'string'), nested=True)
            return f"List<{item_type}>"
        
        # Handle nested objects
        if atproto_type.get('type') == 'object':
            return 'Document'
    
    # Default to String if type is not recognized
    mapped_type = type_mapping.get(atproto_type, 'String')
    
    return mapped_type

def generate_smithy_structure(lexicon_def: Dict[str, Any]) -> str:
    """
    Generate a more comprehensive Smithy structure from an ATP lexicon definition
    """
    # Determine structure name and properties
    structure_name = lexicon_def.get('id', 'UnnamedStructure')
    
    # Try to find properties in different possible locations
    properties = (
        lexicon_def.get('defs', {}).get('main', {}).get('record', {}).get('properties', {}) or
        lexicon_def.get('defs', {}).get('main', {}).get('properties', {}) or
        {}
    )
    
    # Start building the Smithy structure
    smithy_lines = [
        f"@documentation(\"Generated from ATP Lexicon\")",
        f"structure {structure_name} {{",
    ]
    
    # Collect property details
    property_details: List[str] = []
    
    # Process each property
    for prop_name, prop_details in properties.items():
        # Determine type and optionality
        prop_type = convert_atproto_type_to_smithy(prop_details.get('type', 'string'))
        
        # Check if property is required
        required = prop_details.get('required', False)
        
        # Prepare optional documentation
        prop_lines = []
        description = prop_details.get('description')
        if description:
            prop_lines.append(f"    @documentation(\"{description}\")")
        
        # Add required trait if not optional
        if required:
            prop_lines.append(f"    @required")
        
        # Add property line with correct Smithy syntax
        prop_lines.append(f"    {prop_name}: {prop_type}")
        
        # Combine lines for this property
        property_details.append("\n".join(prop_lines))
    
    # Add properties to structure with proper comma placement
    for i, prop in enumerate(property_details):
        smithy_lines.append(prop + ("," if i < len(property_details) - 1 else ""))
    
    # Close the structure
    smithy_lines.append("}")
    
    return "\n".join(smithy_lines)

def convert_lexicon_to_smithy(lexicon_file: str) -> str:
    """
    Convert an entire ATP lexicon file to Smithy IDL
    """
    try:
        with open(lexicon_file, 'r', encoding='utf-8') as f:
            lexicon_data = json.load(f)
    except Exception as e:
        print(f"Error reading {lexicon_file}: {e}")
        return ""
    
    # Determine namespace (use lexicon ID or a default)
    namespace = f"lexicon.{lexicon_data.get('id', 'com.example.atproto')}" #.replace('.', '_')
    
    # Start with namespace and imports
    smithy_output = [
        "$version: \"2.0\"",
        f"namespace {namespace}",
        "",
        "// Imports (add as needed)",
        "use alloy#simpleRestJson",
        ""
    ]
    
    # Generate Smithy structures for each definition
    for def_name, def_details in lexicon_data.get('defs', {}).items():
        # Focus on record-like definitions
        if def_details.get('type') in ['record', 'object']:
            try:
                smithy_structure = generate_smithy_structure({
                    'id': def_name,
                    'defs': {'main': def_details}
                })
                smithy_output.append(smithy_structure)
                smithy_output.append("")  # Add a blank line between structures
            except Exception as e:
                print(f"Error processing definition {def_name} in {lexicon_file}: {e}")
    
    return "\n".join(smithy_output)

def process_lexicon_directory(input_dir: str, output_dir: str):
    """
    Recursively process lexicon files in a directory tree
    """
    # Create output directory if it doesn't exist
    os.makedirs(output_dir, exist_ok=True)
    
    # Counters for reporting
    total_files = 0
    converted_files = 0
    
    # Walk through the directory tree
    for root, _, files in os.walk(input_dir):
        for file in files:
            # Check if file is a lexicon JSON file
            if file.endswith('.json'):
                total_files += 1
                input_path = os.path.join(root, file)
                
                # Preserve directory structure in output
                relative_path = os.path.relpath(root, input_dir)
                output_subdir = os.path.join(output_dir, relative_path)
                os.makedirs(output_subdir, exist_ok=True)
                
                # Generate output filename (replace .json with .smithy)
                output_filename = os.path.splitext(file)[0] + '.smithy'
                output_path = os.path.join(output_subdir, output_filename)
                
                # Convert lexicon to Smithy
                smithy_content = convert_lexicon_to_smithy(input_path)
                
                # Write Smithy file if content is not empty
                if smithy_content.strip():
                    try:
                        with open(output_path, 'w', encoding='utf-8') as f:
                            f.write(smithy_content)
                        print(f"Converted: {input_path} -> {output_path}")
                        converted_files += 1
                    except Exception as e:
                        print(f"Error writing {output_path}: {e}")
    
    # Print summary
    print(f"\nConversion Summary:")
    print(f"Total JSON files found: {total_files}")
    print(f"Successfully converted files: {converted_files}")

def main():
    # Set up argument parser
    parser = argparse.ArgumentParser(description='Convert ATP Lexicon files to Smithy IDL')
    parser.add_argument('input_directory', type=str, help='Input directory containing lexicon JSON files')
    parser.add_argument('output_directory', type=str, help='Output directory for Smithy files')
    
    # Parse arguments
    args = parser.parse_args()
    
    # Process the directory
    process_lexicon_directory(args.input_directory, args.output_directory)

if __name__ == "__main__":
    main()