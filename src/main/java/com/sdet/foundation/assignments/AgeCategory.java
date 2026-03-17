package com.sdet.foundation.assignments;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age");
        int age= scanner.nextInt();
        if(age>=0 && age<=12) {
            System.out.println("Child");
        }
        else if(age>=13 && age<=19){
            System.out.println("Teenage");

        }
        else if (age>=20 && age<=59){
            System.out.println("Adult");
        }
        else if (age>=60){
            System.out.println("Senior Citizen");
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}
