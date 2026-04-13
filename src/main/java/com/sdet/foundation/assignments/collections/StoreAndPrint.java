package com.sdet.foundation.assignments.collections;

public class StoreAndPrint {

//    Example Input
//
//      ["LoginTest", "SignupTest", "CheckoutTest"]
//    Example Output
//
//              LoginTest
//              SignupTest
//              CheckoutTest
    public static void main(String[] args) {
        // Create an array of 5 integers
        int[] numbers = new int[5];

        System.out.println("Values stored in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
