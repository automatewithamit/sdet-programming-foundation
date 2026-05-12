package com.sdet.foundation.week1.exception.concepts;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        String str = null; // This string is not initialized and points to null

//        try {
            // Attempting to call a method on a null reference will throw NullPointerException
            int length = str.length();// This line will throw NullPointerException
            System.out.println("Length of the string: " + length);
//        } catch (NullPointerException e) {
//            System.out.println("Caught a NullPointerException: " + e.getMessage());
//        }
    }
}
