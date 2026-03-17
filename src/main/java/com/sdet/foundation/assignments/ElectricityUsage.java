package com.sdet.foundation.assignments;

import java.util.Scanner;

public class ElectricityUsage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Units");
        int unit= scanner.nextInt();
        if(unit>=0 && unit<=100) {
            System.out.println("low Usage");
        }
        else if(unit>100 && unit<=300){
            System.out.println("Medium Usage");

        }
        else if (unit>300){
            System.out.println("High Usage");
        }

        else {
            System.out.println("Invalid Input");
        }
    }
}
