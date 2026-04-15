package com.sdet.foundation.week1.keywords;

public class SuperKeyword {

    //Why Super keyword is used in Java?
    // The 'super' keyword in Java is used to refer to the immediate parent class of the current class. It is commonly used in the following scenarios:
    // 1. To call the parent class's constructor from the child class's constructor.
    // 2. To call a method from the parent class that has been overridden in the child class.
    // 3. To access a member variable from the parent class that has been hidden by a member variable in the child class.

    // Parent class (Base class)
    static class Parent {
        public void displayMessage() {
            System.out.println("This is a message from the Parent class.");
        }
    }

    // Child class (Derived class) that inherits from Parent
    static class Child extends Parent {

        public void displayMessage() {
            super.displayMessage(); // Calling the method from the Parent class using 'super'
            System.out.println("This is a message from the Child class.");
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.displayMessage();
        //Call the displayMessage() method from the Parent class using 'super' keyword in the Child class
        child.displayMessage(); // This will call the displayMessage() method from the Child class, which in turn calls the Parent class's method using 'super'
    }
}
