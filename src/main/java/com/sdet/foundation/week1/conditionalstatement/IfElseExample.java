package com.sdet.foundation.week1.conditionalstatement;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a Number");
        int number = scn.nextInt();

        if(number %2==0){
            System.out.println("Even Number");
        }
        else
            System.out.println("Odd Number");
    }
}
