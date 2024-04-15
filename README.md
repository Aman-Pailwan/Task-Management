# Task Manager API

## Introduction

The Task Manager API is a simple yet powerful application built using Spring Boot, PostgreSQL, and Docker. It allows users to manage tasks through a RESTful API, providing endpoints for creating, updating, deleting, and retrieving tasks.

## Table of Contents

1. [Overview](#1-overview)
2. [Features](#2-features)
3. [Setup](#3-setup)
4. [Endpoints](#4-endpoints)
5. [Frontend](#5-Frontend)

## 1. Overview

The Task Manager API is designed to streamline task management by providing a scalable and efficient solution for organizing tasks. It leverages Spring Boot for rapid development, PostgreSQL for robust data storage, and Docker for containerization.

## 2. Features

- CRUD operations for tasks (Create, Read, Update, Delete)
- RESTful API endpoints for interacting with tasks
- Scalable architecture using Spring Boot and Docker
- Secure data storage with PostgreSQL

## 3. Setup

### Prerequisites

- **Docker**: 
  - For Linux:
    ```bash
    sudo apt-get update
    sudo apt-get install docker-ce docker-ce-cli containerd.io
    ```
  - For Windows:
    Download and install Docker Desktop from [here](https://www.docker.com/products/docker-desktop).

- **Java Development Kit (JDK)**:
  - For Linux:
    ```bash
    sudo apt-get update
    sudo apt-get install openjdk-17-jdk
    ```
  - For Windows:
    Download and install the latest JDK version (17 or higher) from [here](https://www.oracle.com/java/technologies/javase-downloads.html).


### Running the Application

1. Clone this repository to your local machine.
2. Make sure Docker is running.
3. Navigate to the root directory of the project.
4. Run the following command to start the PostgreSQL database:

   ```bash
   docker-compose up -d
   ```
## Once the database is up and running, build the Spring Boot application using Maven:

```bash
$ mvn clean package
```
## After the build is successful, run the application with the following command:

```bash
$ java -jar target/Tasks-0.0.1-SNAPSHOT.jar
```

## The application should now be running at http://localhost:8080

## 4. Endpoints
```
GET /api/v1/tasks: Retrieves a list of all tasks.
GET /api/v1/tasks/{id}: Retrieves details of a specific task by ID.
POST /api/v1/tasks: Creates a new task.
PUT /api/v1/tasks/{id}: Updates an existing task.
DELETE /api/v1/tasks/{id}: Deletes a task by ID.
```

## 5. Frontend

The frontend of the Task Manager application is located in the project directory. It consists of HTML, CSS, and JavaScript files that provide a user-friendly interface for interacting with the Task Manager API.

To run the frontend:

Navigate to the frontend directory in your project.
Open the index.html file in a web browser.
Remember to update the API fetch requests in the frontend code to use http://localhost:8080 as the base URL when running the application locally.
```
// Example API fetch request in JavaScript
fetch('http://localhost:8080/api/v1/tasks')
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.error('Error fetching tasks:', error));
```


