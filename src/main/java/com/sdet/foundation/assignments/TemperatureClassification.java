package com.sdet.foundation.assignments;

import java.util.Scanner;

public class TemperatureClassification {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Temperature");
        double temp=scanner.nextDouble();
        if(temp>30){
            System.out.println("Temperature is Hot");
        }
        else if (temp>=20){
            System.out.println("Temperature is Moderate");
        }
        else{
            System.out.println("Temperature is Cold");
        }

    }
}
