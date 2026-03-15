package com.sdet.foundation.week1.loops;

import java.util.Scanner;

public class EvenOddLoop {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        for(;;){
            System.out.println("Enter a Number");
            int number = scn.nextInt();

            if(number %2==0){
                System.out.println("Even Number");
            }
            else
                System.out.println("Odd Number");
            System.out.println("Do you want to Continue ? (y/n)");
            String exit = scn.next();


            if(exit.equals("n")){
                break;
            }
            else if (exit.equals("y")){
                System.out.println("Continuing the loop");
            }



        }

    }
}
