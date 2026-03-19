//Find the largest of three numbers
//    Objective: Accept three numbers and print which one is largest.
//    Example Input: 12, 45, 7
//    Example Output: 45 is the largest number


package com.sdet.foundation.week1.conditionalstatement;

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        System.out.println(" Enter 3 numbers");
        Scanner scanner = new Scanner(System.in);
        int num1= scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();

        if(num1>num2 && num1>num3) {
            System.out.println("Number1 is largest");
        } else if (num2>num1 && num2 > num3) {
            System.out.println("Number2 is largest");
        }
        else {
            System.out.println("Number3 is largest");
        }


    }
}
