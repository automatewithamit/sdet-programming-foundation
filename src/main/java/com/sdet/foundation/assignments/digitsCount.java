package com.sdet.foundation.assignments;

import java.util.Scanner;

public class digitsCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int input= scanner.nextInt();
        int count=0;
        while(input>0){
            input=input/10;
            count=count+1;
        }
        System.out.println(count);
    }
}
