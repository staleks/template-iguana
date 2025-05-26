# template-iguana
Java 21, Spring 4, Hexagonal Showcase

## Project Overview

**Project Name:** template-iguana
**Version:** 1.0.0
**Description:** Java 21, Spring 4, Hexagonal Showcase
**Author:** Aleksandar Stoisavljevic
**Email:** staleks@gmail.com

**Tech Stack:**
- Java 21
- Spring Boot 4
- JPA
- Liquibase
- Logback
- H2 Database (for testing)
- Jib

**Purpose:**

This project is a showcase(template) for building Java applications using the Spring Framework v4.x and the Hexagonal (Ports & Adapters) architecture. It’s designed to demonstrate best practices for modular, testable, and maintainable Java applications.

**Key Features:**

- Uses modern Java (version 21).
- Follows Hexagonal Architecture, promoting separation of concerns.
- Includes Docker support for containerized deployment.

## Building Image
```
$ ./gradlew jibDockerBuild
```

## How to run app as Docker Container?

```
$ docker run -p 8080:8080 -it -e "SPRING_PROFILES_ACTIVE=dev" staleks/template-iguana
```