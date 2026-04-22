package com.sdet.foundation.week1.oops.polymorphism;

public class PolymorphismConcept {
    public static void main(String[] args) {
        //What is Polymorphism?
        //Polymorphism is a fundamental concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass.
        // It enables a single interface to represent different underlying forms (data types).
        // Polymorphism is often expressed as "one interface, many implementations."


        //Types of Polymorphism:
        //1. Compile-time Polymorphism (Method Overloading): This occurs when multiple methods in the same class have the same name but different parameters (different type, number, or both). The method to be called is determined at compile time based on the method signature.
        //2. Runtime Polymorphism (Method Overriding): This occurs when a subclass provides a specific implementation of    a method that is already defined in its superclass. The method to be called is determined at runtime based on the actual object type.
        //Operator Overloading: This is a specific type of compile-time polymorphism where operators are overloaded to work with user-defined types. Java does not support operator overloading, but it is a common feature in languages like C++.

        // Example of polymorphism in Java
        //+ , - , * , / are examples of operator overloading in Java. They can be used with different data types (int, double, etc.) to perform arithmetic operations. However, Java does not allow user-defined operator overloading.
        //Example of operator overloading in Java
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1 + " " + str2); // Output: Hello World
        int num1 = 5;
        int num2 = 10;
        System.out.println(num1 + num2); // Output: 15
        // In the above examples, the '+' operator is overloaded to work with both String and int data types. This is an example of operator overloading in Java.




    }

}
