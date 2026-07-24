# Student Management System (MVC Architecture)

A Java-based console application for managing students, courses, and administrative accounts. This project adheres strictly to the **Model-View-Controller (MVC)** design pattern and the **Data Access Object (DAO)** pattern for clean separation of concerns, scalability, and maintainability.

---

## 📐 Project Architecture

The application is structured into distinct layers:

```
src/main/java/com/harsh/org/
├── App.java                   # Main entry point placeholder
├── controller/
│   └── UserController.java    # Routes inputs from View to Service layer
├── service/
│   ├── UserService.java       # Interface defining business logic operations
│   └── impl/
│       └── UserServiceImpl.java # Business logic implementation
├── dao/
│   ├── AdminDAO.java          # Admin DAO interface
│   ├── StudentDAO.java        # Student DAO interface
│   ├── CourseDAO.java         # Course DAO interface
│   └── impl/
│       ├── AdminDAOImpl.java  # Admin database operations (JDBC)
│       ├── StudentDAOImpl.java# Student database operations (JDBC)
│       └── CourseDAOImpl.java # Course database operations (JDBC)
├── dto/
│   ├── AdminDTO.java          # Data Transfer Object for Admin
│   ├── StudentDTO.java        # Data Transfer Object for Student
│   └── CourseDTO.java         # Data Transfer Object for Course
├── utility/
│   └── DbConnection.java      # Database connection helper using JDBC
└── view/
    ├── MainDashboard.java     # CLI main menu (Register/Login)
    └── AdminDashboard.java    # Admin menu (CRUD operations for Students & Courses)
```

---

## ✨ Features

- **Admin Management**:
  - Register new Admin account
  - Admin login authentication
- **Student Management (CRUD)**:
  - Add new Student details
  - View all registered Students
  - Update existing Student information by ID
  - Delete Student record by ID
- **Course Management**:
  - Add new Course details (Name, Duration, Fees)

---

## 📌 TODO / Roadmap

- [ ] Complete full CRUD operations for **Course Management**:
  - [x] Add Course
  - [ ] View All Courses
  - [ ] Update Course
  - [ ] Delete Course

---

## 🛠️ Tech Stack & Dependencies

- **Language**: Java 15+
- **Build Tool**: Apache Maven
- **Database**: MySQL Server 8.0+
- **JDBC Driver**: `mysql-connector-java` 8.0.33

---

## 🗄️ Database Setup

Before running the application, configure your MySQL database `student_management` with the required tables:

```sql
CREATE DATABASE IF NOT EXISTS student_management;
USE student_management;

-- Admin Table
CREATE TABLE IF NOT EXISTS admin (
    admin_id INT PRIMARY KEY AUTO_INCREMENT,
    admin_user VARCHAR(50) UNIQUE NOT NULL,
    admin_pass VARCHAR(100) NOT NULL
);

-- Course Table
CREATE TABLE IF NOT EXISTS course (
    course_id INT PRIMARY KEY AUTO_INCREMENT,
    course_name VARCHAR(100) NOT NULL,
    course_duration VARCHAR(50) NOT NULL,
    course_fees BIGINT NOT NULL
);

-- Student Table
CREATE TABLE IF NOT EXISTS student (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(20),
    age INT,
    city VARCHAR(50),
    course_id INT,
    FOREIGN KEY (course_id) REFERENCES course(course_id) ON DELETE SET NULL
);
```

---

## ⚙️ Configuration

Update your database credentials in [DbConnection.java](file:///c:/Users/piyus/OneDrive/Desktop/StudentManagementMVC/src/main/java/com/harsh/org/utility/DbConnection.java):

```java
final String URL = "jdbc:mysql://localhost:3306/student_management";
final String USER = "root";       // Replace with your MySQL username
final String PASS = "your_pass";   // Replace with your MySQL password
```

---

## 🚀 Getting Started

### 1. Clone & Build

```bash
# Build the project using Maven
mvn clean compile
```

### 2. Run the Application

Execute the main dashboard menu from your IDE or via command line:

```bash
# Running MainDashboard
mvn exec:java -Dexec.mainClass="com.harsh.org.view.MainDashboard"
```

---

## 📝 License

This project is created for learning and demonstration purposes.
