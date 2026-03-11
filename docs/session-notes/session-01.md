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

The development environment was configured using **IntelliJ IDEA**.

### Steps Completed

- Installed IntelliJ IDEA
- Created a **Maven-based Java project**
- Verified project structure

---

## GitHub Setup

GitHub account was created and configured.

### Steps Completed

- Created GitHub account
- Created repository for the learning program
- Student was added as collaborator
- Repository was cloned locally

---

# Git Concepts Explained

The following Git concepts were introduced:

- Repository
- Clone
- Commit
- Push
- Branching

### Hands-on Practice

The student practiced:

- Cloning the repository
- Making code changes
- Creating commits
- Pushing code to GitHub

---

# Java Concepts Covered

## Naming Conventions

Java naming conventions were introduced.

### Camel Case (Variables / Methods)

Example:

```
calculateTotal
userName
testResult
```

### Pascal Case (Class Names)

Example:

```
UserAccount
LoginPage
TestSuite
```

---

# Variables and Data Types

Basic Java data types were introduced.

### Data Types Discussed

- `int`
- `double`
- `boolean`
- `char`
- `String`

### Example

```java
int age = 30;
double salary = 50000.50;
boolean isActive = true;
String name = "Sonal";
```

---

# Control Statements

Decision making using conditional statements was introduced.

## if Statement

```java
if (age > 18) {
    System.out.println("Eligible");
}
```

## if-else Statement

```java
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

## Nested if

The concept of nested conditional statements was explained.

## Switch Statement

The concept of handling multiple conditions using `switch` statements was introduced.

---

# Taking Input from User

The student learned how to read user input using the `Scanner` class.

### Example

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

System.out.println("Enter your name:");

String name = scanner.nextLine();

System.out.println("Hello " + name);
```

---

# Hands-on Coding

During the session we practiced:

- Printing values
- Using variables
- Taking user input
- Writing conditional statements
- Running Java programs in IntelliJ
- Committing code to GitHub

---

# Assignments Given

The following assignments were given for practice:

1. Write a program to check if a number is **even or odd**
2. Write a program to find the **largest of two numbers**
3. Write a program that **takes input from user and prints the value**

### Submission

Assignments must be **committed and pushed to the GitHub repository**.

---

# Next Session Plan

In the next session we will cover:

- Loops (`for`, `while`)
- Logical operators
- More programming exercises
- Writing structured Java programs

---

# Session Outcome

By the end of the session the student successfully:

- Set up IntelliJ and GitHub
- Cloned and worked with a repository
- Learned Java basics
- Practiced conditional logic
- Pushed code to GitHub
- Completed the initial programming setup

This session established the **foundation required for Java programming and future automation testing concepts**.