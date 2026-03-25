package com.sdet.foundation.assignments;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        int number=scanner.nextInt();
        int sum=1;
        int previousSum=0;
        for(int series=0;series<number;series++){
            previousSum=sum;
            sum=sum+previousSum;
            System.out.println(sum);

        }
    }
}
