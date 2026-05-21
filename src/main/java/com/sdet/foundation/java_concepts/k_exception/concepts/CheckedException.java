package com.sdet.foundation.java_concepts.k_exception.concepts;

public class CheckedException {
    public static void main(String[] args) {
        try {
            // Attempting to read a file that does not exist will throw FileNotFoundException
            java.io.FileReader file = new java.io.FileReader("nonexistentfile.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Caught a FileNotFoundException: " + e.getMessage());
        }
    }
}
