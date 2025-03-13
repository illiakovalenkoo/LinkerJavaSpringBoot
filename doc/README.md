# Linker - Spring Boot URL Shortener

**Linker** is a Spring Boot-based web application that allows users to **shorten and manage URLs**. The project includes **database storage using MySQL** and provides a **REST API** for integration.

## 1. How to Download and Run the Project

### **Prerequisites**

To run this project, you need to have:

- **Java Development Kit (JDK) 23+** installed. Download from [Adoptium JDK](https://adoptium.net/) or use OpenJDK.
- **Apache Maven** installed. Download from [Maven](https://maven.apache.org/download.cgi).
- **MySQL Database** installed. You can use [MAMP](https://www.mamp.info/en/) for an easy setup on macOS or Windows.

### **Setting Up the MySQL Database**

1. **Install MySQL or MAMP**:
   - Download and install MySQL from the [official website](https://dev.mysql.com/downloads/).
   - Alternatively, install [MAMP](https://www.mamp.info/en/) and start MySQL from there.

2. **Create a New Database**:
   ```sql
   CREATE DATABASE linker_db;
   ```

3. **Configure the Database Connection**:
   - Open `src/main/resources/application.properties` and set the correct credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/linker_db?useUnicode=true&serverTimezone=UTC
     spring.datasource.username=root
     spring.datasource.password=root
     spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
     ```

### **Clone the Repository**

1. **Download the repository**:
   ```sh
   git clone https://github.com/illiakovalenkoo/LinkerJavaSpringBoot.git
   cd LinkerJavaSpringBoot
   ```

### **Run the Application**

- **Option 1: Using IntelliJ IDEA**:
  1. Open the project in **IntelliJ IDEA**.
  2. Navigate to `LinkerApplication.java` in `src/main/java/com/example/linker`.
  3. Click **Run**.
  4. The application starts at `http://localhost:8080/`.

- **Option 2: Running from the Terminal**:
  1. **Build the project**:
     ```sh
     mvn clean package
     ```
  2. **Run the JAR file**:
     ```sh
     java -jar linker.jar
     ```

## 2. First-Time Execution Issues

- **Java not installed** → Install **JDK 17+**.
- **MySQL database not configured** → Ensure MySQL is running and the `linker_db` database is created.
- **Port already in use** → Ensure no other applications are using **port 8080**.

## 3. Project Structure

```
│── src/                           # Source code of the application
│── images/                        # Screenshots and images for documentation
│── doc/                           # README.md file
```

## 4. Technologies Used

- **Java 23+**
- **Spring Boot**
- **MySQL** (via MAMP or standalone server)
- **Thymeleaf** (UI Rendering)
- **Maven** (for project management)

## 5. Application Testing

The application has been tested for:

 **Database connectivity with MySQL**  
 **URL shortening and redirection**  
 **Graphical interface responsiveness**  
 **REST API responses**  
 **Unit and integration tests with JUnit and Mockito**  

## 6. License

This project is licensed under the **MIT License**. You are free to use, modify, and distribute this software with no restrictions. The software is provided "as is", without warranty of any kind.

 **Happy coding!**

