package com.sdet.foundation.assignments.patterns;

public class PrintIncreasingDecreasingStars {
    public static void main(String[] args) {

        for(int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int row1=4;row1>=1;row1--){
            for(int col1=1;col1<=row1;col1++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
