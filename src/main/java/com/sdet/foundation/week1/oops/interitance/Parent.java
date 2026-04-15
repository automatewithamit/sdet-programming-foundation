package com.sdet.foundation.week1.oops.interitance;

public class Parent extends  GrandParent {

    //1. Class Variables (Fields)
    //example of class variable
    String name;
    int age;

    public Parent() {
        //super("Default Name", 0); // Call the constructor of the GrandParent class with default values
    }

    //2. Constructor
    public Parent(String name, int age) {
        super();// Call the constructor of the GrandParent class
        // Call the constructor of the GrandParent class with parameters
        this.name = name; // 'this' refers to the current instance variable 'name'
        this.age = age;   // 'this' refers to the current instance variable 'age'

    }
    //3. Methods
    public void displayInfo() {
        System.out.println("Parent is : " + this.name + " and age is : " + this.age);
    }



    public void displayMessage() {
        System.out.println("This is a message from the Parent class.");
    }
}
