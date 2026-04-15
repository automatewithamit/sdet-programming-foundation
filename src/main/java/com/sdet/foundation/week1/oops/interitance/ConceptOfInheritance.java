package com.sdet.foundation.week1.oops.interitance;

public class ConceptOfInheritance {



    // Parent class (Base class)
    static class Parent {


        public void displayMessage() {
            System.out.println("This is a message from the Parent class.");
        }
    }

    // Child class (Derived class) that inherits from Parent
    static class Child extends Parent {
        // The Child class can use the displayMessage() method from the Parent class
    }



    public static void main(String[] args) {

        // Creating an instance of the Child class
        Child child = new Child();

        // Accessing the inherited method from the Parent class
        child.displayMessage();
    }
    //Types of Inheritance in Java:
    //1. Single Inheritance: A class inherits from a single parent class.
    //2. Multilevel Inheritance: A class inherits from a parent class, which in turn inherits from another parent class.
    //3. Hierarchical Inheritance: Multiple classes inherit from a single parent class.
    //4. Multiple Inheritance (through interfaces): A class can implement multiple interfaces, allowing it to inherit behavior from multiple sources.


}
