package com.sdet.foundation.assignments;

import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three angles");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();
        if (angle1 > 0 && angle2 > 0 && angle3 > 0) {

            if (angle1 + angle2 + angle3 == 180) {
                System.out.println("Valid Triangle");
            } else {
                System.out.println("Invalid Triangle");
            }
        } else {
            System.out.println("Invalid Triangle");
        }

    }
}

