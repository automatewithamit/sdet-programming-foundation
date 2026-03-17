package com.sdet.foundation.assignments;

import java.util.Scanner;

public class InputValue {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name");
        String Name= scanner.next();
        System.out.println("Your name is Hello " + Name);
    }
}
