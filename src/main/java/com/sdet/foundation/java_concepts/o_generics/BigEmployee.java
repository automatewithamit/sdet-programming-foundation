package com.sdet.foundation.java_concepts.o_generics;

public class BigEmployee {
    private String name;
    private int id;
    private int age;
    private double salary;
    private String department;

    public BigEmployee(String name, int id, int age ,double salary, String department) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.department = department;

    }
    public int getAge(){return age;}
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}
