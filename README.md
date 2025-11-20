# 🐾 Pet Management System

A simple Java console-based application for registering pets, storing them in a dynamic list, and generating formatted reports.
This project demonstrates basic object-oriented programming, array manipulation, and controller-view structure in Java.

## 📌 Features

- Add new pets (name, type, age)
- Automatic array resizing when capacity is exceeded
- Generate a formatted table-style report of all registered pets
- Clean MVC-style package organization (`model`, `controller`, `views`)
- Uses `StringBuilder` for efficient text report generation

## 📁 Project Structure

```
src/
 ├── controller/
 │    ├── petadministrator.java   // Manages pets and dynamic resizing
 │    └── report.java             // Builds and returns formatted reports
 │
 ├── model/
 │    └── pets.java               // Pet class (name, type, age)
 │
 └── views/
      └── executor.java           // Menu, user input, program execution
```

## 🚀 How It Works

### 1. Add a Pet
The user inputs a pet's:
- name
- type
- age

The `petadministrator` stores each pet in an internal array.
If the array is full, it automatically expands by 10 slots.

### 2. Generate Report
The `report` class builds a formatted pet table using:

```
Name            Type              Age
======================================
Charlie         Dog                4
Luna            Cat                3
...
```

## ▶️ Running the Program

Compile the project:

```sh
javac */*/*.java
```

Run the program:

```sh
java views.executor
```

## ✨ Example Menu

```
========== Pets Menu ==========
1. Add Pet
2. Print Pet Report
0. Exit
======================================
Select an option:
```

## 🔧 Technologies Used

- Java 24+
- Standard libraries (`Scanner`, `StringBuilder`, arrays`)

## 📜 License

This project is open-source and free to use for educational purposes.
