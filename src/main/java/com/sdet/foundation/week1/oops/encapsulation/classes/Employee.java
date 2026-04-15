package com.sdet.foundation.week1.oops.encapsulation.classes;

import com.sdet.foundation.week1.oops.encapsulation.accessmodifiers.AccessModifiers;

public class Employee {
    //What is a class?
    //A class is a blueprint or template for creating objects. It defines the properties (attributes/fields) and behaviors (methods) that the objects created from the class will have. In this case, the Employee class represents an employee in a company and has properties like name, age, department, and employee ID, as well as behaviors like working and taking breaks.

    //Encapsulation: The Employee class encapsulates the properties and behaviors of an employee,
    // allowing us to create objects that represent individual employees with their own unique attributes and actions. By using encapsulation, we can control access to the properties and methods of the Employee class,
    // ensuring that they are used in a way that maintains the integrity of the data and the functionality of the class.


    //Properties/Attributes/Fields
    //Instance Variables, Member Variables, Data Members
    String name;
    int age;
    String department;
    int employeeId;
    //What are the properties of an employee? Name, age, department, employee ID, etc.


    //Constructor

    //What is a constructor?
    // A constructor is a special method that is called when an object is instantiated. It is used to initialize the properties of the object. In this case, the constructor takes four parameters (name, age, department, employeeId) and assigns them to the corresponding properties of the Employee class.
    //Types of constructors:
    //1. Default Constructor: A constructor that takes no parameters and initializes the object with default values. If no constructor is defined in a class, Java provides a default constructor automatically.
    // Example of a default constructor:


     public Employee() {
         System.out.println("Default constructor called. Initializing with default values.");
         this.employeeId = 0;
         this.name = "Unknown";
         this.age = 0;
         this.department = "Unknown";
         this.employeeId = 0;
     }

    //2. Parameterized Constructor: A constructor that takes parameters to initialize the object with specific values. In the below example, we have a parameterized constructor that initializes the properties of the Employee class with the values passed as arguments when creating an instance of the Employee class.

    public Employee(String name, int age, String department, int employeeId) {
        System.out.println("Parameterized constructor called. Initializing with provided values.");
        this.name = name;
        this.age = age;
        this.department = department;
        this.employeeId = employeeId;
    }

    //3. Copy Constructor: A constructor that creates a new object as a copy of an existing object. It takes an object of the same class as a parameter and initializes the new object with the values of the existing object. Java does not provide a default copy constructor, so you need to define it explicitly if you want to use it.

    //Benefits of a copy constructor:
    //1. It allows you to create a new object that is a copy of an existing object, which can be useful when you want to create a new instance with the same properties as an existing instance.
    //2. It can help to avoid issues related to shallow copying, where changes to the original object can affect the copied object if they share references to mutable objects. A copy constructor can create a deep copy of the object, ensuring that the new object is independent of the original object.

    // When to use a copy constructor:
    //1. When you want to create a new object that is a copy of an existing object, and you want to ensure that the new object is independent of the original object.
    //2. When you want to implement a cloning mechanism for your class, allowing you to create copies of objects without using the default clone() method provided by the Object class, which can be complex and may require handling CloneNotSupportedException.

    // Example of a copy constructor:
    public Employee(Employee existingEmployee) {
        System.out.println("Copy constructor called. Creating a copy of the existing employee.");
        this.name = existingEmployee.name;
        this.age = existingEmployee.age;
        this.department = existingEmployee.department;
        this.employeeId = existingEmployee.employeeId;
    }


    //4. Static Constructor: Java does not have a concept of static constructors like some other programming languages. However, you can achieve similar functionality by using static blocks to initialize static variables or perform static initialization tasks. Static blocks are executed when the class is loaded into memory, and they can be used to initialize static properties or perform any necessary setup for the class.

     static {
         System.out.println("Static block executed. This can be used for static initialization.");
     }

    //Methods/Behaviors
    public void work() {
         int hoursWorked = 8; // Local variable to represent hours worked
        System.out.println(name + " is working in the " + department + " department.");
    }
    public void takeBreak() {
        AccessModifiers accessModifiers = new AccessModifiers();
        //accessModifiers.protectedVariable = "Protected Variable Value"; // Accessing protected variable from AccessModifiers class
        System.out.println(name + " is taking a break.");
    }



}
