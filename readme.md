# ATProto smithy playground 

This repository is an attempt to generate Scala implementation of [ATProto Lexicon](https://atproto.blue/en/latest/atproto_lexicon).

## Project anatomy

### `lexicons` directory

This directory is a copy of ATProto schema from https://github.com/bluesky-social/atproto/tree/main/lexicons, it contains the description of Bluesky protocol encoded as lexicon

### `py` directory

Contains script that attempts to convert lexicon files to smithy definitions

Usage: `./run.sh`

Disclaimer: This script is purely AI generated, I didn't bother to learn lexicon 😅

### `scala` directory

Contains AI translation of the former script
Usage: `./run.sh`
