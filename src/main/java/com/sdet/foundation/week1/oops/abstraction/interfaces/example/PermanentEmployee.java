package com.sdet.foundation.week1.oops.abstraction.interfaces.example;

public class PermanentEmployee implements IBaseEmployee , IEmployee {

    @Override
    public void work() {
        System.out.println("Permanent Employee is working on long-term projects.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Permanent Employee Details:");
            System.out.println("Employee Name: John Doe");
            System.out.println("Employee ID: 12345");
            System.out.println("Salary: $50000");

    }

    @Override
    public void defaultMethod() {
        IEmployee.super.defaultMethod();
    }
}
