package com.sdet.foundation.week1.oops.polymorphism.overloading;

public class MethodOverloading {



    //Method Overloading is a feature in Java that allows a class to have more than one method with the same name, as long as their parameter lists are different. This is a form of compile-time polymorphism.
    //Conditions for Method Overloading:
    //1. Method should be in same class.
    //2. Method name should be same.
    //3. Method should have different signature.

    //What is method signature?
    //Method signature is the combination of method name and parameter list (number, type, and order of parameters).
    // The return type is not considered part of the method signature for overloading purposes.


    // Method to add two integers
    public int add(double a, int b, int c) {
        return (int)a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }




    // Overloaded method to concatenate two strings
    public String add(String str1, String str2) {
        return str1 + str2;
    }
    //Example of method overloading in Java

 //Confusing Example of method overloading in Java

//    public int sum(int asdfasdf, int b) {
//        return asdfasdf + b;
//    }
//
//    public int sum(int b, int a) {
//        return a + b;
//    }


}
