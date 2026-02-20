# OOC2 Lab Solutions

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat-square)

Complete lab solutions for the Object-Oriented Computing 2 (OOC2) module at Atlantic Technological University (ATU).

## Overview

This repository contains fully worked Java lab solutions covering core OOC2 topics including collections, file I/O, serialization, exception handling, JavaFX, command-line arguments, and AI integration with HuggingFace. Each solution is organized by topic under the `ie.atu` package namespace and is ready to run in Gitpod or GitHub Codespaces.

## Features

- **Collections** -- ArrayList, LinkedList, iterators, and performance comparisons
- **File I/O** -- Byte and character streams, buffered readers/writers, CSV parsing
- **Serialization** -- Object and list serialization/deserialization
- **Exception Handling** -- Arithmetic, input mismatch, out of bounds, and custom exceptions
- **JavaFX** -- Application windows and TableView examples
- **Command-Line Arguments** -- Parsing and converting argument formats
- **AI Integration** -- HuggingFace question-answering API examples
- **Cloud IDE Support** -- Pre-configured for Gitpod and GitHub Codespaces

## Prerequisites

- Java 21 or later (Zulu JDK recommended)
- A Java IDE (VS Code with Java Extension Pack, IntelliJ IDEA, or Eclipse)
- Git

## Getting Started

### Installation

```bash
git clone https://github.com/danielcregg/ooc2-lab-solutions.git
cd ooc2-lab-solutions
```

Alternatively, open directly in a cloud IDE:

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/danielcregg/ooc2-lab-solutions)

### Usage

Compile and run any lab solution from the project root:

```bash
javac -d bin src/ie/atu/collections/CollectionsExample.java
java -cp bin ie.atu.collections.CollectionsExample
```

Or open the project in your IDE and run individual files directly.

## Tech Stack

- **Language:** Java 21
- **GUI Framework:** JavaFX
- **Build Environment:** Gitpod / GitHub Codespaces (Dev Containers)

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
