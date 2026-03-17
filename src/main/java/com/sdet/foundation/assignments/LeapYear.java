package com.sdet.foundation.assignments;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter year");
        int year= scanner.nextInt();
        if(year%400 ==0 ){
            System.out.println("Year is leap year");
        }
        else if (year%100 !=0 && year%4 ==0){
            System.out.println("year is  leap year");
        }
//        else if (year % 400 == 0){
//            System.out.println("Year is leap year");
//        }
        else{
            System.out.println("Year is not a leap year");
        }
    }
}
