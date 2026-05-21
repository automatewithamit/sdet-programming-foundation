package com.sdet.foundation.java_concepts.k_exception.examples;

import java.util.Scanner;

public class ThrowKeyword {
    // This method demonstrates the use of the throw keyword to manually throw an exception
    public static void validateAge(int age) {
        if (age < 18) {
            // Manually throwing an IllegalArgumentException if the age is less than 18
            throw new IllegalArgumentException("Age must be at least 18. Provided age: " + age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void validateVoterEligibility(int age) {
        validateAge(age); // This will throw an exception if age is less than 18
    }

    public static void main(String[] args) throws InterruptedException, IllegalArgumentException {
//        try{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        validateAge(age); // This will throw an exception because 15 is less than 18
        Thread.sleep(2000);
//    } catch (IllegalArgumentException e) {
//
//        System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
//        System.out.println("Please enter a valid age next time.");
//    }


    }
}
