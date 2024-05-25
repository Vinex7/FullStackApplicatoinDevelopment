
# UltimateCrudApp

## Overview

UltimateCrudApp is a simple Spring Boot application that provides RESTful APIs for managing users. This guide will help you set up, run the application, and test the APIs using Swagger.

## Prerequisites

Before you start, make sure you have the following installed on your computer:

- **Java Development Kit (JDK) 17**: This is needed to run Java applications.
- **Maven**: A tool that helps manage project dependencies and build the application.
- **An Integrated Development Environment (IDE)**: Such as IntelliJ IDEA or Eclipse, to edit and run the code.

## Setup and Run the Application

### Step 1: Clone the Repository

Clone the project repository to your local machine using the following command:

```bash
git clone <repository-url>
```

### Step 2: Open the Project in Your IDE

Open the cloned project in your IDE (IntelliJ IDEA, Eclipse, etc.).

### Step 3: Add Dependencies

Ensure your `pom.xml` includes the necessary dependencies. The key dependencies are already included in the project.

### Step 4: Build and Run the Application

Build and run the application using Maven. You can use the following commands:

```bash
./mvnw clean install
./mvnw spring-boot:run
```

### Step 5: Access the Application

1. Open your web browser.
2. Navigate to `http://localhost:8080/swagger-ui.html` to access the Swagger UI.

### Testing the APIs

#### Accessing Swagger UI

Once the application is running, you can access the Swagger UI to view and test the APIs.

1. Open your web browser.
2. Navigate to `http://localhost:8080/swagger-ui.html`.

#### Available Endpoints

The following endpoints are available in the UltimateCrudApp:

1. **Add a New User**
   - **Method**: PUT
   - **URL**: `/api/users`
   - **Request Body**:
     ```json
     {
         "firstName": "Thabelo",
         "lastName": "Silima",
         "contactNumber": "+1234567890"
     }
     ```

2. **Update an Existing User**
   - **Method**: POST
   - **URL**: `/api/users/{userId}`
   - **Request Body**:
     ```json
     {
         "firstName": "Thabelo",
         "lastName": "Silima",
         "contactNumber": "+0987654321"
     }
     ```

3. **Retrieve a User by ID**
   - **Method**: GET
   - **URL**: `/api/users/{userId}`

4. **Delete a User by ID**
   - **Method**: DELETE
   - **URL**: `/api/users/{userId}`

### Using Swagger UI

1. **Navigate to the Swagger UI**: Open `http://localhost:8080/swagger-ui.html` in your browser.
2. **Explore the APIs**: You will see a list of available endpoints. Click on an endpoint to expand it and see more details.
3. **Test the APIs**: For each endpoint, you can input the required parameters and click the "Try it out" button to test the API.

## Additional Notes and Observations

### Logging

The application uses SLF4J for logging. Logs are printed to the console, providing information about the operations performed. This is helpful for debugging and monitoring the application’s behavior.

### Validation

Input validation is implemented using Spring Boot's validation starter. Ensure that the input data is in the correct format to avoid validation errors. For example, the contact number should match the pattern defined in the model.

### Error Handling

The application includes basic error handling to manage scenarios like missing resources or invalid input. This ensures that users receive meaningful error messages and helps maintain the application's stability.

### Swagger Integration

Using `springdoc-openapi` for Swagger integration provides a user-friendly interface for exploring and testing the APIs. This makes it easier for developers and users to understand and interact with the application.

### Development Observations

- **Modular Code**: Keeping the code modular and well-organized improves readability and maintainability. The separation of controller, service, and model classes helps in managing the codebase effectively.
- **Dependency Management**: Properly managing dependencies in `pom.xml` ensures that the project builds correctly and all necessary libraries are included.
- **Testing**: Regular testing using tools like Postman or Swagger UI is crucial for verifying the functionality of the APIs. Automated tests can also be added to ensure the application behaves as expected.

## Conclusion

This guide provides the steps needed to set up, run, and test the UltimateCrudApp. By following these instructions, you should be able to interact with the application's APIs and understand its functionality. If you encounter any issues, please refer to the project documentation or seek help from the community.
