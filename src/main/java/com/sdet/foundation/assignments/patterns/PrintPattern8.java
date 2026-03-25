package com.sdet.foundation.assignments.patterns;

public class PrintPattern8 {
    public static void main(String[] args) {

        for(char row='A';row<='E';row++){
            for(char col='A';col<=row;col++){
                System.out.print(col);
            }
            System.out.println(" ");
        }
    }
}
