package com.sdet.foundation.assignments;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        /*
        Fibonacci Series is sum of previous two numbers and first two numbers in the series are 0 and 1
        * 0 1 1 2 3 5 8 11.....
        *
        * */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Series Length : ");
        int seriesLength= scanner.nextInt();

        int firstNum = 0;
        int secNum = 1;

        System.out.print(firstNum +" "+ secNum);
        for (int i = 0; i < seriesLength-2; i++) {
            int thirdNum = firstNum + secNum;
            System.out.print( " "+thirdNum);
            firstNum = secNum;
            secNum = thirdNum;

        }




    }
}
