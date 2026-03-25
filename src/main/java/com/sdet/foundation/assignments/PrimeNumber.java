package com.sdet.foundation.assignments;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        int input= scanner.nextInt();
        if(input<=1){
            System.out.println(input  + "is not a prime number");
        }
        else if(input==2 || input==3 || input==5){
            System.out.println(input + "is a prime number");
        }
        for (int number=2;number<input;number++){
            if (input%number==0){
                System.out.println(input + "is not a prime number");
            }

        }
        System.out.println(input + "is a prime number");
    }
}
