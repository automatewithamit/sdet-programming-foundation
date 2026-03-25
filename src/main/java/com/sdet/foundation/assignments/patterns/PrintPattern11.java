package com.sdet.foundation.assignments.patterns;

public class PrintPattern11 {
    public static void main(String[] args) {
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= 5 - row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}