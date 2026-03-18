package com.sdet.foundation.assignments;

import java.util.Scanner;

public class MultiplicaionTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        int input= scanner.nextInt();
        for(int result=1;result<=10;result++){
            //System.out.println(String.format( input  + "*" + result + " = ") +   input * result );
            System.out.println(input  + "*" + result + " = " +   input * result );
        }
    }
}
