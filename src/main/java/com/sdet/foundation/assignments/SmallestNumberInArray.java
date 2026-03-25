package com.sdet.foundation.assignments;

public class SmallestNumberInArray {

        public static void main(String[] args) {
            int[] numbers = {-10, -20, 3, 40};
            int max = numbers[0];
            for (int element : numbers) {
                if (element <= max) {
                    max = element;

                }
            }
            System.out.println("Smallest number is :" + max);
        }
    }

