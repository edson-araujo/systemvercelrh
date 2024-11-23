# System Vercel RH

This is a Spring Boot-based application designed for managing HR (Human Resources) operations. The project uses the Maven build system and adheres to a modular structure, ensuring scalability and maintainability.

---

## 🚀 Features

- **Spring Boot Framework**: Simplifies Java application development.
- **Maven Build System**: Efficient dependency management and project building.
- **DAO Design Pattern**: Clean separation of data access logic.
- **Modular Structure**: Promotes reusability and maintainability.
- **Database Integration**: Seamlessly handles data storage and retrieval.

---

## 🛠️ Technologies Used

- **Java**: Primary programming language.
- **Spring Boot**: Framework for rapid application development.
- **Maven**: Dependency and project management.
- **Database**: (Specify your database, e.g., MySQL, PostgreSQL, etc.)

---

## 📂 Project Structure

The project is organized as follows:

```
/src
  /main
    /java/com/edson/curso/spring
      - DemoApplication.java   # Main application entry point
      /dao
        - AbstractDao.java     # Generic DAO class
        - CargoDao.java        # DAO class for Cargo entity
  /resources
    - application.properties   # Spring Boot configuration
/mvnw                          # Maven wrapper
pom.xml                        # Maven configuration file
```

---

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

- Java 11 or higher
- Maven 3.8.x or higher
- (Optional) An IDE like IntelliJ IDEA or Eclipse

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/systemvercelrh.git
   cd systemvercelrh
   ```

2. Build the project using Maven:

   ```bash
   ./mvnw clean install
   ```

   On Windows:

   ```cmd
   mvnw.cmd clean install
   ```

3. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

   Or, using Java directly:

   ```bash
   java -jar target/systemvercelrh-0.0.1-SNAPSHOT.jar
   ```

---

## 🧪 Testing

Run the tests with Maven:

```bash
./mvnw test
```

---

## 📖 Documentation

### Key Files

- **`DemoApplication.java`**: Main class to bootstrap the application.
- **`AbstractDao.java`**: Generic DAO with basic database operations.
- **`CargoDao.java`**: DAO specific to the `Cargo` entity.
- **`application.properties`**: Configuration for Spring Boot and database.

---

## 📬 Feedback and Support

If you have any questions, issues, or feature requests, please open an issue or contact [your email](mailto:youremail@example.com).

---

## 👤 Author

**Edson Araujo**

- GitHub: [@edson-araujo](https://github.com/edson-araujo)
- LinkedIn: [Edson Araújo]([https://linkedin.com/in/yourprofile](https://www.linkedin.com/in/edson-alves-araujo/))

---

## 📝 License

This project is licensed under the [MIT License](LICENSE.md). Feel free to use, modify, and distribute as per the terms of the license.
