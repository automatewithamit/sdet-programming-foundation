package com.sdet.foundation;

import java.util.Scanner;

public class Class1 {

    public static void main(String[] args) {

        System.out.println("Enter Your Name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Enter Your Age : ");
        int age  = scanner.nextInt();
        //if Condition
        if(age>18) {
            System.out.println(name + "is an Adult with age " + age);
            System.out.println("Your Entered Name is " + name);
        }
        //If Else Condition
        if(age>18)
            System.out.println(name + "is Eligible to Vote with Age " + age);
        else
            System.out.println(name + "is NOT Eligible to Vote because of Age " + age);
        //Nested if else Condition - if else condition inside another if else
        if(age>18) {
            System.out.println(name + "is Eligible to Vote with Age " + age);
            if (age > 25)
                System.out.println(name + "is Eligible to Marriage " + age);
        }
        else {
            if (age > 25)
                System.out.println(name + "is Eligible to Marriage " + age);
            System.out.println(name + "is NOT Eligible to Vote because of Age " + age);
        }
        //Switch - Write Program to Print Week days name when user enters 1-7
        System.out.println("----------------------------------------------");
        System.out.println("Enter Day's Number : ");
        int dayNumber = scanner.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("No Matching Days Found");
        }

    }
    //Variables & DataTypes
    String student1 = "Sonal";
    int age = 23;
    float marks  = 45.09F;
    double goodMarks = 5434.0034;
    char character = 'a';
    boolean isActive = false;

    //Naming Conventions of Variables
    //1. camelCasing - firstLetterIsSmallAndRestOfFirstLetterAreCapital  - varableNames, methodNames
    //2. PascalCasing - FirstCharacterOfEachWordIsCapital - ClassName

    //Control Statements -
    // if , if else , nested if else, switch statements


    //Take Input from user
    //Scanner class helps to take input from user
    //
}
