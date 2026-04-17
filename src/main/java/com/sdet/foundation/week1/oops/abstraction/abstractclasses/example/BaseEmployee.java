package com.sdet.foundation.week1.oops.abstraction.abstractclasses.example;

public abstract class BaseEmployee {
    protected String name;
    protected int id;

    public BaseEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

//    public void displayInfo() {
//        System.out.println("---------------------------------------");
//        System.out.println("Base Employee Information:");
//        System.out.println("Employee Name: " + name);
//        System.out.println("Employee ID: " + id);
//    }

    public abstract void displayInfo(); // Abstract method to be implemented by subclasses

    //Example of common method for all employees
    public void calculateBonus() {
        System.out.println("Calculating bonus for employee: " + name);
    }

}
