package com.sdet.foundation.assignments;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=scanner.nextInt();
        if(age >= 18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
