package com.sdet.foundation.week1.loops;

import java.util.Scanner;

public class NumberFrom1_10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a Number");
        int number = scn.nextInt();
        for( int i = 1; i<=number ; i++){
            System.out.println(i);
        }


    }
}
