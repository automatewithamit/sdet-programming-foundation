package com.sdet.foundation.week1.oops.abstraction.abstractclasses.example;

public class PermanentEmployee extends BaseEmployee {

    private double salary;

    public PermanentEmployee(String name, int id, double salary) {
        super(name, id);
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Permanent Employee Details:");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: $" + salary);
    }


}
