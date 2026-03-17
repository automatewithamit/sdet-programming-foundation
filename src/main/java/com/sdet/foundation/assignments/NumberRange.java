package com.sdet.foundation.assignments;

import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        int number= scanner.nextInt();
        if(number>=1 && number<=50) {
            System.out.println("Low Range");
        }
            else if(number>=51 && number<=100){
                System.out.println("Medium Range");

            }
            else if (number>100){
            System.out.println("High Range");
        }
            else {
            System.out.println("Invalid Input");
        }

    }
}
