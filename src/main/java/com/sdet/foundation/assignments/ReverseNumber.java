package com.sdet.foundation.assignments;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number :");
        int input= scanner.nextInt();
        int result=0;
        int temp;
        while(input>0){
           temp=input%10 ;
           result=result*10+temp;
           input=input/10;
        }

        System.out.println(result);
    }
}


/* 134
134%10=4
134/10=13
result =4
13%10=3
13/10=1
result=4*10+3
1%10=1
1/10=0
result=43*10+1
 */