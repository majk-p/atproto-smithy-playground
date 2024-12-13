#!/bin/bash
scala-cli run main.scala -- ../lexicons smithy/lexicons
smithy4s generate --output scala-lexicon smithy/lexicons/
