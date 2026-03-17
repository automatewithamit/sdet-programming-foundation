package com.sdet.foundation.assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        System.out.println("Enter operation");
        String operation = scanner.next();
        switch (operation) {
            case "+":
                System.out.println("Addition of two number is " + (number1 + number2));
                break;
            case "-":
                System.out.println("substraction of two number is " + (number1 - number2));
                break;
            case "*":
                System.out.println("Multiplication of two number is " + number1 * number2);
                break;
            case "/":
                System.out.println("Division of two number is " + number1 / number2);
                break;
            default:
                System.out.println("Invalid Operation");


        }
    }
}