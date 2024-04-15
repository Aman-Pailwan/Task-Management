# Task Manager API

This is a simple Task Manager API built using Spring Boot, PostgreSQL, and Docker.

## Setup

### Prerequisites

- Docker installed on your machine
- Java Development Kit (JDK) version 17 or higher

### Running the Application

```bash
# Clone this repository to your local machine
git clone <repository_url>

# Make sure Docker is running
# Navigate to the root directory of the project
cd Task-Manager-API

# Start the PostgreSQL database
docker-compose up -d

# Build the Spring Boot application using Maven
mvn clean package

# Run the application
java -jar target/Tasks-0.0.1-SNAPSHOT.jar

The application should now be running at http://localhost:8080.

Endpoints
GET /api/v1/tasks: Retrieves a list of all tasks.
GET /api/v1/tasks/{id}: Retrieves details of a specific task by ID.
POST /api/v1/tasks: Creates a new task.
PUT /api/v1/tasks/{id}: Updates an existing task.
DELETE /api/v1/tasks/{id}: Deletes a task by ID.

Documentation
The API documentation can be found in the docs directory.

Contributing
Contributions are welcome! Please feel free to fork this repository and submit pull requests.

