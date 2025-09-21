# Patience Card Game - Claude Code Guidelines

## Project Overview

This is a Java-based implementation of a patience (solitaire) card game. The project demonstrates object-oriented programming concepts, game logic implementation, and user interface design patterns in Java. It provides a digital version of classic patience card games with proper game state management and rule enforcement.

## Development Environment

**Operating System**: Windows 11
**Shell**: Git Bash / PowerShell / Command Prompt
**Important**: Always use Windows-compatible commands:
- Use `dir` instead of `ls` for Command Prompt
- Use PowerShell commands when appropriate
- File paths use backslashes (`\`) in Windows
- Use `python -m http.server` for local development server
- Git Bash provides Unix-like commands but context should be Windows-aware

## Development Guidelines

### Code Quality
- Follow Java naming conventions (camelCase for variables/methods, PascalCase for classes)
- Use meaningful variable and method names
- Implement proper exception handling
- Add comprehensive Javadoc comments for public methods and classes
- Follow SOLID principles and design patterns where appropriate
- Maintain clean, readable code
- Follow language-specific best practices

### Security
- No sensitive information in the codebase
- Use HTTPS for all external resources
- Regular dependency updates
- Follow security best practices for the specific technology stack

### Game Development Specific Guidelines
- Implement proper card game logic with rule validation
- Use appropriate data structures for card decks and game state
- Handle user interactions responsively and consistently
- Implement proper state management for game progression
- Use efficient algorithms for card shuffling and dealing
- Separate game logic from presentation layer
- Implement proper undo/redo functionality where applicable

## Learning and Communication
- Always explain coding actions and decisions to help the user learn
- Describe why specific approaches or technologies are chosen
- Explain the purpose and functionality of code changes
- Provide context about best practices and coding patterns used
- Provide detailed explanations in the console when performing tasks, as many concepts may be new to the user