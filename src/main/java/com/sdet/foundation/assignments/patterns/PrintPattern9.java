package com.sdet.foundation.assignments.patterns;

public class PrintPattern9 {
    public static void main(String[] args) {
        for (char row = 'E'; row >= 'A'; row--) {
            for (char col = 'A'; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println("");
        }
    }
}