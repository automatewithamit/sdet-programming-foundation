package com.sdet.foundation.week1.oops.encapsulation.classes;

public class Main {
    public static void main(String[] args) {
        //
        Employee emp = new Employee(); // Create an instance of the Employee class using the default constructor
        emp.employeeId = 12345; // Set the employeeId property
        emp.name = "Jane Smith"; // Set the name property
        emp.age = 28; // Set the age property
        emp.department = "Marketing"; // Set the department property

        emp.work(); // Call the work method on the emp object
        emp.takeBreak(); // Call the takeBreak method on the emp object

        //Create an instance of the Employee class
        Employee emp1 = new Employee("John Doe", 30, "Software Engineer", 743453);
        System.out.println("Employee Name: " + emp1.name);
        System.out.println("Employee Age: " + emp1.age);
        System.out.println("Employee Department: " + emp1.department);
        System.out.println("Employee ID: " + emp1.employeeId);


    }
}
