package com.sdet.foundation.assignments;


import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int input= scanner.nextInt();
        int result=1;
        for (;input>=1;input--){
            result=input * result;

        }
        System.out.println(result);
    }
}
