package com.sdet.foundation.week1.arrays;

public class PrintEvenIndex {
    public static void main(String[] args) {
        printNumbersAtEvenIndex();
        System.out.println();
        System.out.println("--------------------------");
        printNumbersInReverseOrder();
        System.out.println();
        System.out.println("--------------------------");
        printSumOfNumbersInArray();
    }

    public static  void printSumOfNumbersInArray(){
        int[] numbers = {10, 20, 30, 40,50,60,80,100};
        int sum =0;
        for (int i = numbers.length-1; i>=0 ; i--) {
            sum += numbers[i];
        }
        System.out.println( "Sum of Numbers inside Array is : "+ sum);
    }
    public static  void printNumbersInReverseOrder(){
        int[] numbers = {10, 20, 30, 40,50,60,80,100};
        for (int i = numbers.length-1; i>=0 ; i--) {
            System.out.print(numbers[i]+ " ");
        }
    }
    public static void printNumbersAtEvenIndex(){
        int[] numbers = {10, 20, 30, 40,50,60,80,100};

        for (int i = 0; i < numbers.length; i=i+2) {
            System.out.print(numbers[i]+ " ");
        }
    }
}
