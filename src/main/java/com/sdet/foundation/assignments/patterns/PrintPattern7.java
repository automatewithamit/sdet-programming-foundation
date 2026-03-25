package com.sdet.foundation.assignments.patterns;

public class PrintPattern7 {
    public static void main(String[] args) {
        int num=1;
        for(int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
                //int num=1;
                System.out.print(num);
                num++;

            }
            System.out.println(" ");
        }
    }
}
