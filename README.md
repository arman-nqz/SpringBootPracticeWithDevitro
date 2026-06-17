# Spring Boot Practice With Devtiro

A collection of small Java and Spring Boot practice projects created while following the Devtiro Spring Boot tutorial series.

The repository is organized as a learning workspace: each numbered folder focuses on a specific concept, starting from a basic Spring Boot quickstart and moving toward dependency injection, configuration, databases, PostgreSQL, and JDBC Template.

## Tutorial Reference

These projects were built while following this Devtiro YouTube tutorial:

[Spring Boot Tutorial by Devtiro](https://youtu.be/Nv2DERaMx-4?si=_672rJUC9Lp4wtuL)

## Project Structure

| Folder | Project | Main Focus |
| --- | --- | --- |
| `01/quickstart` | Quickstart | Basic Spring Boot application and controller setup |
| `02 color printer java vanila/untitled` | Vanilla Java Color Printer | Interfaces and simple Java class structure without Spring |
| `02 colours printer Sprint boot/ColoursPrinter` | Spring Boot Color Printer | Dependency injection and service implementations |
| `03 starter/starter` | Starter | Basic generated Spring Boot project structure |
| `04 PizzaApplication/PizzaApplication` | Pizza Application | Spring configuration and bean setup |
| `05 database/database` | Database | Introductory database-related Spring Boot project |
| `06 PostgreSQL/database` | PostgreSQL | PostgreSQL integration with Docker Compose |
| `07 database Jdbc template/jdbcTemplateTrain` | JDBC Template Training | DAO layer, JDBC Template, PostgreSQL, H2 tests, and integration tests |

Some folders also include `.zip` archives of the corresponding project.

## Technologies Used

- Java 17
- Spring Boot
- Maven
- Spring Web MVC
- Spring Data JDBC
- JDBC Template
- PostgreSQL
- H2 Database for testing
- Docker Compose for local PostgreSQL setup

## Getting Started

Each project is independent and includes its own Maven wrapper. Navigate into the project you want to run, then use the wrapper from that folder.

Example:

```powershell
cd "01\quickstart"
.\mvnw spring-boot:run
```

On macOS or Linux:

```bash
cd "01/quickstart"
./mvnw spring-boot:run
```

## Running Tests

From inside any Maven project folder:

```powershell
.\mvnw test
```

For macOS or Linux:

```bash
./mvnw test
```

## Running Database Projects

The PostgreSQL-based projects include a `docker-compose.yml` file. Start PostgreSQL from the project folder before running the application or integration tests.

Example:

```powershell
cd "06 PostgreSQL\database"
docker compose up -d
.\mvnw spring-boot:run
```

Stop the database when finished:

```powershell
docker compose down
```

## Learning Goals

This repository is intended to practice:

- Creating and running Spring Boot applications
- Building simple REST/controller-based projects
- Understanding dependency injection
- Defining and wiring services
- Using Spring configuration classes
- Connecting Spring Boot applications to databases
- Working with PostgreSQL locally
- Implementing DAO classes with JDBC Template
- Writing unit and integration tests

## Notes

This is a learning repository, so the projects are intentionally small and focused on individual concepts rather than production-ready application design.

## License

This project is licensed under the terms of the [LICENSE](LICENSE) file.
