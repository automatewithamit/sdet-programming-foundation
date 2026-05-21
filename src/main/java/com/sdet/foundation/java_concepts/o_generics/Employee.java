package com.sdet.foundation.java_concepts.o_generics;
// Employee Class
class Employee implements Person {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() { return this.age; }

    @Override
    public String toString() { return "Employee: " + name + " (Age: " + age + ")"; }
}