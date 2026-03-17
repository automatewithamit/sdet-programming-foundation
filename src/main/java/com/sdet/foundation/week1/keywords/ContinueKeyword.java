package com.sdet.foundation.week1.keywords;

public class ContinueKeyword {

    //Used to skip current iteration in any loop

    //Program to Print from 1 to 50 and skip printing number when a number divisible by 11

    public static void main(String[] args) {
        for(int i = 1; i <=10; i++) {

            if (i%2==0)
                continue;
            System.out.print(i + "  ");
        }
    }



}
