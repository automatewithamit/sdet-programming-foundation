package com.sdet.foundation;

import java.util.Scanner;

public class Assignment1 {
//    1 Check if a number is even or odd
    int number= 10;
//    Objective: Write a program to check if the given number is even or odd.
//    Example Input: 8
//    Example Output: 8 is even
// 🎯 Hint: Use if-else and the modulus operator %.
public static void main(String[] args) {
    System.out.println("Enter Number : ");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    if(num % 2==0)
    {
        System.out.println("Number is even Number");
    }
    else
    {
        System.out.println("Number is odd Number");
    }
}

//
//        System.out.println("Enter Your Age : ");
//        int age  = scanner.nextInt();
//    2 Find the largest of three numbers
//    Objective: Accept three numbers and print which one is largest.
//    Example Input: 12, 45, 7
//    Example Output: 45 is the largest number



// 🎯 Hint: Use nested if-else statements.
//
//3 Check if a year is a leap year
//    Objective: Determine whether the entered year is a leap year.
//    Example Input: 2024
//    Example Output: 2024 is a leap year
// 🎯 Hint: A year divisible by 4 and not by 100, or divisible by 400, is a leap year.
}
