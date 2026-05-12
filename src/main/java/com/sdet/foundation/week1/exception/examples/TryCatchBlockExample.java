package com.sdet.foundation.week1.exception.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlockExample {

    public static void main(String[] args) {

            //Creating a User  - create data
            //Assigning Admin role to the user - perform action
            //Asserted that the user has admin role - validate the action
            //Deleting user data from the database - clean up activity
        int a=0,b=0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
             a = scanner.nextInt();
            System.out.print("Enter the second number: ");
             b = scanner.nextInt();
        }catch (InputMismatchException e){
            //Recursion :
            main(args);
            System.out.println("Caught an InputMismatchException: " + e.getMessage());
        }


        try {

            // This line will throw ArithmeticException because of division by zero
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());

        } catch  (Exception e){
            System.out.println("Caught a general exception: " + e.getMessage());
        }
        finally {
            System.out.println("This block will always execute, regardless of exceptions.");
        }

        System.out.println("Program continues after handling the exception.");
    }
}
