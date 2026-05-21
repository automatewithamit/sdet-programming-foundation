package com.sdet.foundation.java_concepts.k_exception.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {
    // This method declares that it throws an InterruptedException
    public static void sleepForAWhile() throws InterruptedException {
        System.out.println("Sleeping for 2 seconds...");

        Thread.sleep(2000); // This can throw InterruptedException

        System.out.println("Awake now!");
    }

    public static void readFile(String filePath) throws IOException {
        FileReader file = new FileReader(filePath); // Risky operation
        BufferedReader reader = new BufferedReader(file);
        System.out.println(reader.readLine());
        reader.close();
    }


    public static void main(String[] args) throws InterruptedException, IOException {
        readFile("test.txt");
        sleepForAWhile();
//        try {
//            sleepForAWhile(); // Calling the method that throws InterruptedException
//        } catch (InterruptedException e) {
//            System.out.println("Caught an InterruptedException: " + e.getMessage());
//        }
    }
}
