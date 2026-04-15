package com.sdet.foundation.week1.keywords;

public class ThisKeyword {
    private String name;
    private int age;

    public ThisKeyword(String name, int age) {
        this.name = name; // 'this' refers to the current instance variable 'name'
        this.age = age;   // 'this' refers to the current instance variable 'age'
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name); // 'this' is optional here, but used for clarity
        System.out.println("Age: " + this.age);   // 'this' is optional here, but used for clarity
    }

    public static void main(String[] args) {
        ThisKeyword person = new ThisKeyword("Alice", 30);
        person.displayInfo();
    }
}
