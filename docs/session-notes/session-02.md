# Session 2 – Programming Foundation

**Date:** 11 Mar 2026  
**Session:** 02

---

# Objective of the Session

The goal of this session was to reinforce conditional programming concepts, review assignments from the previous session, and introduce debugging techniques that help in understanding program execution step-by-step.

By the end of the session the student should be able to:

- Review and improve previously written programs
- Understand how to debug a program step-by-step
- Use `if`, `if-else`, and `if-else-if` conditions effectively
- Understand nested conditional statements
- Understand when to use `switch` statements
- Improve logical thinking while writing programs

---

# Session Recap

The session started with a quick review of **Session 1**, where the following topics were covered:

- IntelliJ setup
- Maven project creation
- GitHub repository setup
- Git workflow (clone, commit, push, branch)
- Java variables and data types
- Conditional statements (`if`, `if-else`, `switch`)
- Taking user input using `Scanner`

The repository structure and documentation approach were also revisited.

---

# Assignment Review

Assignments from Session 1 were reviewed.

Programs discussed:

- Even or Odd number
- Largest of two numbers
- User input program

During the review, focus was given to:

- Correct logic implementation
- Proper variable naming
- Code readability
- Understanding how the program executes

---

# Debugging Concepts

A very important concept introduced in this session was **debugging**.

Debugging helps us understand how a program executes **step-by-step**.

## Why Debugging is Important

When learning programming and building logic, debugging allows us to:

- Track variable values during execution
- Understand how conditions are evaluated
- Identify where logic errors occur
- Improve problem-solving skills

Students were shown how to move through the code **line by line** to observe how the program behaves.

This technique is especially useful while learning new programming concepts.

---

# Conditional Statements

During this session we reinforced different types of conditional statements.

## 1. if Statement

Used when a condition must be checked and a block of code should execute only when the condition is true.

```java
if(age > 18){
    System.out.println("Eligible");
}
```

---

## 2. if-else Statement

Used when we need to choose between two possible outcomes.

```java
if(number % 2 == 0){
    System.out.println("Even");
}else{
    System.out.println("Odd");
}
```

---

## 3. if-else-if Statement

Introduced in this session to handle **multiple conditions**.

Example:

```java
if(marks >= 90){
    System.out.println("Grade A");
}else if(marks >= 75){
    System.out.println("Grade B");
}else if(marks >= 50){
    System.out.println("Grade C");
}else{
    System.out.println("Fail");
}
```

This structure allows checking multiple conditions in sequence.

---

## 4. Nested if Statement

Nested conditions allow placing one `if` statement inside another.

Example concept:

```java
if(age >= 18){
    if(age <= 60){
        System.out.println("Eligible Adult");
    }
}
```

Nested conditions are useful when multiple related checks are required.

---

## 5. Switch Statement

Switch statements allow handling multiple conditions based on a variable value.

Example concept:

```java
switch(day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
}
```

Switch statements can be more readable than multiple `if-else` conditions in some scenarios.

---

# Key Learning From This Session

The most important takeaway from this session was understanding that:

> Writing programs is not only about syntax — it is about understanding how the logic flows step-by-step.

Debugging plays a crucial role in developing this understanding.

---

# Skills Developed in This Session

By the end of the session the student practiced:

- Reviewing existing code
- Debugging programs step-by-step
- Understanding how conditions are evaluated
- Writing logic using `if`, `if-else`, and `if-else-if`
- Structuring conditional logic more effectively

---

# Next Session Plan

In the next session we will begin focusing on:

- Looping constructs (`for`, `while`)
- Repeating operations using loops
- Solving more programming problems to strengthen logical thinking