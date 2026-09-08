# Student Management System

## Project Description

Student Management System is a console-based Java application developed to manage student records efficiently. The application allows users to add, view, search, update, and delete student information.

The project demonstrates important Java programming concepts learned during the 6-week Java Development Internship.

## Features

* Add student records
* View all student records
* Search student by Student ID
* Update student details
* Delete student records
* Save student data to a file
* Load student data from a file
* Backup student data using multithreading
* Input validation and exception handling
* Menu-driven console interface

## Technologies Used

* Java
* Eclipse IDE
* Java Collections
* File Handling
* Git
* GitHub

## Java Concepts Used

* Classes and Objects
* Constructors
* `this` keyword
* `static`
* Encapsulation
* Inheritance
* Polymorphism
* Abstraction
* Interfaces
* Exception Handling
* ArrayList
* File Handling
* Multithreading

## Project Structure

```text
StudentManagementSystem/
│
├── src/
│   └── studentmanagement/
│       ├── Main.java
│       ├── Person.java
│       ├── Student.java
│       ├── Manageable.java
│       ├── StudentManager.java
│       ├── FileHandler.java
│       └── BackupThread.java
│
├── students.txt
├── screenshots/
└── README.md
```

## How to Run the Project

1. Install Java JDK on the computer.
2. Open Eclipse IDE.
3. Import or open the `StudentManagementSystem` project.
4. Open the `Main.java` file.
5. Run `Main.java` as a Java Application.
6. Select an option from the menu.
7. Enter the required student information.

## Main Menu

```text
=================================
     STUDENT MANAGEMENT SYSTEM
=================================
1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Backup Data
7. Exit
=================================
```

## Sample Student Record

```text
Student ID : 100
Name       : shahina
Course     : information technology
Age        : 20
Marks      : 100
```

## File Handling

Student records are stored in the `students.txt` file. The application can save student information and load previously saved records when the application starts.

## Multithreading

The project uses a separate thread for the backup operation. The `BackupThread` class performs the backup task without making the main application responsible for the backup process.

## Future Improvements

* Add a graphical user interface
* Add login and authentication
* Add database connectivity using JDBC
* Add sorting and filtering options
* Generate student performance reports
* Add more advanced search features

## Conclusion

The Student Management System demonstrates the practical use of Java concepts learned during the internship. The project provides basic student record management while demonstrating object-oriented programming, collections, exception handling, file handling, interfaces, abstraction, and multithreading.
