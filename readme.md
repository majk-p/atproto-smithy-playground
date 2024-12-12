# ATProto smithy playground 

This repository is an attempt to generate Scala implementation of [ATProto Lexicon](https://atproto.blue/en/latest/atproto_lexicon).

## Project anatomy

### `lexicons` directory

This directory is a copy of ATProto schema from https://github.com/bluesky-social/atproto/tree/main/lexicons, it contains the description of Bluesky protocol encoded as lexicon

### `main.py` script

This script attempts to convert lexicon files to smithy definitions

Usage: `python3 main.py ./lexicons smithy-lexicon`

Disclaimer: This script is purely AI generated, I didn't bother to learn lexicon 😅

### `smithy-lexicon` directory

Smithy sources generated with the script above

### `atproto-scala` directory

Scala sources generated out of `smithy-lexicon` using smithy4s

Install smithy4s cli with `cs install --channel https://disneystreaming.github.io/coursier.json smithy4s`

Generate Scala files with `smithy4s generate --output atproto-scala smithy-lexicon`