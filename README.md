## MyOperations

### Project Summary
**MyOperations** is a web-based application designed for managing operations. Its primary focus is on handling customer-related operations, including managing **customers**, their **contacts**, and **users** within the system.

The project integrates role-based access control to ensure users have appropriate permissions. User authentication and localization are included, with multi-language support and default credentials functionality. The system defines a detailed UI for managing entities, which includes forms and lists for entities like Customers, Contacts, and Users, adhering to best practices for modularity and maintainability.

The application uses **Vaadin Flow** for creating responsive web UI and incorporates Spring Security for secure user authentication and authorization. It leverages **Jmix**, which is an extension of Spring Boot, for rapid development, rich data management, and business logic.

### Technology Stack
1. **Backend Frameworks and Libraries:**
   - **Spring Boot**: Provides core application development features and dependency injection.
   - **Jmix**: Supports business logic, entity management, and UI design for enterprise applications.
   - **Spring Security**: Ensures authentication, authorization, and security configuration.
   - **HikariCP**: Database connection pool provider (through `main.datasource` configuration).

2. **Frontend:**
   - **Vaadin Flow**: A Java-based framework for building modern web user interfaces, focusing on server-side development.
   - **Vaadin's Lumo Theme**: A customizable design theme to enrich the UI.
   - **PWA (Progressive Web Application)**: Used for improving the app's mobile usability and offline capabilities.

3. **Utilities:**
   - **SLF4J (Simple Logging Facade for Java)** and **Logback** (via LoggerFactory): For logging and debugging purposes.
   - **Jakarta Persistence API**: Entity management for performing database operations.
   - **Apache Commons Lang**: For string utilities and other helper methods.

4. **Database:**
   - **JDBC** with **HikariCP**: Used for connecting to and executing database operations.

5. **Security Frameworks:**
   - **Spring Security**: For managing authentication and roles within the application.
   - **Custom Role Policies**: Defined using resource-based role policies in the Jmix framework.

6. **Build and Configuration:**
   - **Maven**: Build automation tool for managing dependencies and build lifecycle.
   - **Application Configuration** via Spring Boot properties (e.g., `application.properties`).

7. **Localization:**
   - **Multi-locale Support**: The application dynamically adjusts the locale settings for the UI based on user selection or session settings.

### Notable Features of the Application
- **Entity Management**:
  - Customers and their contacts are managed through dedicated views.
  - Users are managed with password encoding and role assignments.

- **Access Control**:
  - Security roles such as `FullAccessRole` and `UiMinimalRole` are defined, providing granular access management for system resources.

- **Multi-Language Support**:
  - Interfaces and error messages are localized using `LocaleChangeObserver` and custom translations.

- **Modular Development**:
  - Separate `@ViewController` and `@ViewDescriptor` annotations for views ensure modularity and decoupling of the UI layer from the backend.

- **Customization**:
  - Custom `SecurityFilterChain` for public API endpoints (e.g., `/actuator/**`).

---

## License

This project is licensed under the Apache License 2.0. See the [LICENSE](LICENSE) file for details.

##