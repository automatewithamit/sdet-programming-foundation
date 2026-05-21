package com.sdet.foundation.java_concepts.o_generics;
// Student Class
class Student implements Person {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() { return this.age; }

    @Override
    public String toString() { return "Student: " + name + " (Age: " + age + ")"; }
}



