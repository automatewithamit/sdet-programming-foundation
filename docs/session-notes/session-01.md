# Session 1 – Programming Foundation

**Date:** 10 Mar 2026  
**Session:** 01

---

# Objective of the Session

The goal of this session was to set up the development environment, introduce the GitHub workflow, and start with core Java programming concepts required for automation testing.

By the end of this session the student should be able to:

- Understand the GitHub workflow
- Clone a repository locally
- Create branches
- Commit and push code to GitHub
- Understand basic Java syntax
- Use conditional statements
- Take input from the user
- Write simple Java programs

---

# Environment Setup

## IntelliJ IDEA

Steps completed:

- Installed IntelliJ IDEA
- Created Maven Java project
- Verified project structure

---

## GitHub Setup

Steps completed:

- Created GitHub account
- Created repository for learning program
- Added collaborator
- Cloned repository locally

---

# Git Concepts Introduced

- Repository
- Clone
- Commit
- Push
- Branching

Student practiced:

- Cloning repository
- Creating commits
- Pushing code

---

# Java Concepts Covered

## Naming Conventions

### Camel Case (variables / methods)

```
calculateTotal
userName
testResult
```

### Pascal Case (class names)

```
UserAccount
LoginPage
TestSuite
```

---

# Variables and Data Types

Data types introduced:

- int
- double
- boolean
- char
- String

Example:

```java
int age = 30;
double salary = 50000.50;
boolean isActive = true;
String name = "Sonal";
```

---

# Control Statements

## if statement

```java
if(age > 18){
    System.out.println("Eligible");
}
```

## if-else statement

```java
if(number % 2 == 0){
    System.out.println("Even");
}else{
    System.out.println("Odd");
}
```

## switch statement

Concept of handling multiple conditions.

---

# Taking Input from User

Example using Scanner:

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

System.out.println("Enter your name:");

String name = scanner.nextLine();

System.out.println("Hello " + name);
```

---

# Assignments Given

1. Program to check **even or odd number**
2. Program to find **largest of two numbers**
3. Program to **take input and print the value**

Assignments must be pushed to GitHub.

---

# Session Outcome

By the end of the session the student:

- Set up IntelliJ and GitHub
- Cloned and worked with a repository
- Practiced Java basics
- Practiced conditional logic
- Pushed code to GitHub