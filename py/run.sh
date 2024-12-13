#!/bin/bash
python3 main.py ../lexicons smithy/lexicons
smithy4s generate --output scala-lexicon smithy/lexicons/
