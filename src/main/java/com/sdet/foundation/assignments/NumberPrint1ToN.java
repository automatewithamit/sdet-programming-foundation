package com.sdet.foundation.assignments;
import java.util.Scanner;
public class NumberPrint1ToN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number ");
        int input=scanner.nextInt();
        for(int start=1;start<=input;start++){


            System.out.print(" " + start);
        }

    }
}
