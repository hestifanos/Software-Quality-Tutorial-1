# Software Quality Tutorial 1

A minimal Maven/Java exercise introducing a small `Sum` class and unit tests.

## Requirements

- JDK 20 (the compiler level configured in `pom.xml`)
- Apache Maven

## Build and test

```bash
mvn test
mvn package
```

## Project layout

```text
src/main/java/org/example/Sum.java       Addition logic
src/main/java/org/example/Main.java      Starter entry point
src/test/java/org/example/SumTest.java   JUnit tests
```
