package com.sdet.foundation.assignments;

import java.util.Scanner;

public class PositveNegativeNumber {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        //double Input= scanner.nextDouble();
        int input=scanner.nextInt();
        if(input >0 ){
            System.out.println( input + "Number is positive Number");
        }
        else if(input <0 ){
            System.out.println(input + "Number is negative Number");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}
