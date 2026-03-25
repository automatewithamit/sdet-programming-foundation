package com.sdet.foundation.assignments;

public class PrintStartInAsending {
    public static void main(String[] args) {


        for (int i = 0; i <5; i++) {

            for (int col = 0; col <= i; col++) {

                System.out.print("*");

            }
            System.out.println();
        }
    }
}