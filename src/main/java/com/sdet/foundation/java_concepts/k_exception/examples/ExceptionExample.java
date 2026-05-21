package com.sdet.foundation.java_concepts.k_exception.examples;

public class ExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            // This line will throw ArrayIndexOutOfBoundsException because index 5 is out of bounds
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
