package com.sdet.foundation.week1.oops.encapsulation.getterssetters;

public class Employee {
    //What are Getters and Setters?
    //Getters and Setters are methods that allow you to access and modify the private properties of a class.
    // They provide a way to control how the properties are accessed and modified,
    // ensuring encapsulation and data integrity. Getters are used to retrieve the value of a property, while Setters are used to set or update the value of a property.

    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter and Setter for name
    public String getName() {
        // You can add logic to format the name if needed
        System.out.println("Getting the name of the employee: " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        // You can add validation logic here if needed
        //id should be a positive integer
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID. ID should be a positive integer.");
        }

    }

    // Getter and Setter for salary
    public double getSalary() {
        // You can add logic to calculate or format the salary if needed
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
