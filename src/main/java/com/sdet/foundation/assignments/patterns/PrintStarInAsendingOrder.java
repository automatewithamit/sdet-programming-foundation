package com.sdet.foundation.assignments.patterns;

public class PrintStarInAsendingOrder {

    public static void main(String[] args) {


        for (int row = 1; row <=5; row++) {
            for (int col = 1; col <= row; col++) {

                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}