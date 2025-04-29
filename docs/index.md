# MyOperations Documentation

## Project Summary

**MyOperations** is a web-based application designed to manage operations effectively. Its primary focus includes handling **customers**, their **contacts**, and **users** within the system.

Key features of the application:
- **Role-Based Access Control (RBAC)** to ensure users have appropriate permissions.
- **User Authentication and Localization** with multi-language support and default credentials functionality.
- Detailed UI for managing entities such as Customers, Contacts, and Users.
- Adherence to best practices for modularity and maintainability.

The project uses **Vaadin Flow** to create responsive web UIs and incorporates **Spring Security** for secure user authentication and authorization. It leverages **Jmix** (an extension of Spring Boot) for rapid development, rich data management, and business logic.

---

## Technology Stack

### 1. Backend Frameworks and Libraries
- **Spring Boot**: Provides core application development features and dependency injection.
- **Jmix**: Facilitates business logic, entity management, and UI design for enterprise applications.
- **Spring Security**: Ensures robust authentication and authorization.
- **HikariCP**: Provides database connection pool management.

### 2. Frontend Frameworks and Tools
- **Vaadin Flow**: Java-based framework for modern web UIs with a focus on server-side development.
- **Vaadin's Lumo Theme**: A customizable design theme for a rich user interface.
- **Progressive Web Application (PWA)**: Enhances mobile usability with offline capabilities.

### 3. Utilities
- **SLF4J** and **Logback**: Used for logging and debugging in the application.
- **Jakarta Persistence API**: Manages entities for performing database operations.
- **Apache Commons Lang**: Provides utility methods, especially for working with Strings.

### 4. Database
- **JDBC** with **HikariCP**: Used for connecting to and executing operations on databases.

### 5. Security Frameworks
- **Spring Security**: Enhances application security with robust role- and permission-based controls.
- **Custom Role Policies**: Resource-based role policies defined in the Jmix framework.

### 6. Build and Configuration
- **Maven**: A build automation tool for dependency management and project build lifecycle.
- **Application Configuration**: Managed via Spring Boot properties (e.g., `application.properties`).

### 7. Localization
- **Multi-locale Support**: Dynamically adjusts locale settings based on user preferences or session settings.

---

## Notable Features

### 1. Entity Management
- Dedicated views for managing customers and their contacts.
- User management includes password encoding and role assignments.

### 2. Access Control
- Security roles such as `FullAccessRole` and `UiMinimalRole` are defined, enabling fine-grained access control.

### 3. Multi-Language Support
- Interfaces and error messages are localized using the `LocaleChangeObserver` and custom translations.

### 4. Modular Development
- Separation of concerns with `@ViewController` and `@ViewDescriptor` annotations for views, ensuring a decoupled UI layer.

### 5. Customization
- Custom `SecurityFilterChain` configurations for public API endpoints (e.g., `/actuator/**`).

---

## License

This project is licensed under the **Apache License 2.0**. See the [LICENSE](LICENSE) file for further details.