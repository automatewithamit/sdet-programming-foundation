package com.sdet.foundation.week1.oops.interitance;

public class Main   {
    public static void main(String[] args) {
        // Creating an instance of the Child class
        Child child = new Child();
        child.name = "John";
        child.age = 10;
        child.schoolName = "ABC School";

        // Accessing the inherited method from the Parent class
        child.displayInfo(); // This will call the displayInfo() method from the Parent class
        //how call the displayInfo() method from the Parent class using the child instance


        // Accessing the method from the GrandParent class
        child.displayGrandParentInfo(); // This will call the displayGrandParentInfo() method from the GrandParent class

        // Accessing the method from the Parent class
        child.displayMessage(); // This will call the displayMessage() method from the Parent class

    }
}
