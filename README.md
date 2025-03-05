# 📖 Project Overview
**Reminder URL Shortener** is a **Spring Boot** application that allows users to store and manage shortened links.  
Users can enter a **long URL** and assign a **short name** to it. The system **stores the mapping in a database**  
and allows users to access and manage their shortened links.

---

## 🚀 Features
✔ **Shorten long URLs** with custom names  
✔ **Store links in a MySQL/PostgreSQL database**  
✔ **Click on short links to open the original URL**  
✔ **List all stored links in the database**  
✔ **REST API for URL management**  
✔ **Spring Boot-based backend**  
✔ **Test folder included with UI screenshot**  

---

## 🛠 How It Works
1. **Enter a long URL** (e.g., https://example.com/very-long-url).
2. **Enter a short name** (e.g., my-short-link).
3. **The link is stored in the database** and appears in the list.
4. **Access the original URL** using the short name.

**Example:**
- Input:  
  - **Long URL:** https://example.com/some-really-long-address
  - **Short Name:** example-short
- Output:  
  - The user can now access the long URL via:  
    `http://localhost:8080/example-short`

---

## 📦 System Requirements

### **1️⃣ Java Development Kit (JDK)**
- Download **JDK 17+**: [Adoptium JDK](https://adoptium.net/)  
- Verify installation:
  
  ```sh
  java -version
  ```

### **2️⃣ Spring Boot Framework**
- Uses **Spring Boot 3.x**  
- Auto-configures dependencies  

### **3️⃣ Database**
- Works with **MySQL 8+** or **PostgreSQL**
- Create the database using:
  
  ```sql
  CREATE DATABASE shortener_db;
  ```

---

## 📂 Test Folder

The project includes a **test folder** with a UI screenshot for verification:
- `img.png` – Screenshot of the web interface.

This helps verify that the application is working as expected.

---

## ⚙️ Configuration

1. Open **`application.properties`** (located in `src/main/resources`).
2. Modify database connection settings if needed:
   
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/shortener_db
   spring.datasource.username=root
   spring.datasource.password=root
   ```

3. Save the file.

---

## 💻 How to Run the Application

### **Option 1: Running from IntelliJ IDEA**
1. Open the project in **IntelliJ IDEA**.
2. Ensure **Spring Boot and database dependencies** are configured.
3. Run the **`ReminderApplication`** class.

### **Option 2: Running with Maven**
1. **Build and run the project**:
   
   ```sh
   mvn clean spring-boot:run
   ```

2. Open `http://localhost:8080` in a browser.

### **Option 3: Running as a JAR**
1. **Package the application**:
   
   ```sh
   mvn clean package
   ```

2. **Run the JAR file**:
   
   ```sh
   java -jar target/reminder.jar
   ```

---

## 📡 API Endpoints

| Method | Endpoint           | Description            |
|--------|--------------------|------------------------|
| POST   | `/shorten`         | Shorten a long URL    |
| GET    | `/{short_name}`    | Redirect to long URL  |
| GET    | `/links`           | List all stored links |

---

## 🛠 Built With
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **MySQL / PostgreSQL**
- **Maven**

---

## 📜 License
This project is licensed under the **MIT License** – feel free to use and modify it.  

🚀 **Happy coding!**
