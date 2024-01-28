# JeKa port of Spring Boot Thymeleaf example: CRUD Application

The application is ported in *self* mode, meaning that build, test and application code 
are hosted in *jeka-src* dir.

This keeps things simple for simple app, while we can move it to a project structure easily, later on.

Run the app :
```shell
jeka self#runJar
```
The first launch is longer cause of the initial dependency resolution steps. Next execution are much quicker.

Rerun the jar, after code source change :
```shell
jeka -co self#runJar
```

Original Repo :: https://github.com/bezkoder/spring-boot-thymeleaf-example

# Spring Boot Thymeleaf example: CRUD Application

Build a Spring Boot Thymeleaf CRUD example with Maven that use Spring Data JPA to interact with H2/MySQL/PostgreSQL database. You'll know:
- How to configure Spring Data, JPA, Hibernate to work with Database
- How to define Data Entity and Repository interfaces
- Way to create Spring Controller to process HTTP requests
- Way to use Spring Data JPA to interact with H2/MySQL/PostgreSQL Database
- How to use Thymeleaf template engine for View layer

![spring-boot-thymeleaf-example](spring-boot-thymeleaf-example.png)
