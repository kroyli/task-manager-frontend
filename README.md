# Task Manager Frontend

This is a simple Task Manager application built with **Spring Boot**. It allows users to create, read, update, and delete tasks (CRUD operations) through a REST API and a basic HTML frontend.

## Features

- Create new tasks
- View a list of all tasks
- View details of a specific task
- Update tasks
- Delete tasks
- Simple HTML interface to interact with tasks
- JSON API for integration with other tools

## Technologies Used

- Java 17
- Spring Boot 3
- HTML/CSS for frontend
- Maven for project management

## Getting Started

1. Clone the repository:

git clone https://github.com/kroyli/task-manager-frontend.git

2. Open the project in IntelliJ IDEA or any Java IDE.
   
3. Run the application:
   
mvn spring-boot:run

4. Access the application in your browser:

Frontend: http://localhost:8080/create_task.html

List of tasks: http://localhost:8080/task_list.html

REST API: http://localhost:8080/api/tasks

## Project Structure

src/main/java – Java source code (controllers, models, services)

src/main/resources/templates – HTML frontend files

src/main/resources/application.properties – Spring Boot configuration

## Future Improvements

- Add user authentication

- Enhance frontend with modern frameworks (React, Vue)

- Connect to a database for persistent storage

## Author

Olga Konovalchik
Java Developer Portfolio Project
