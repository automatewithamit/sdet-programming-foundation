package com.sdet.foundation.java_concepts.k_exception.concepts;

public class Exceptions {
    //What are Exceptions?
    //Exceptions are events that occur during the execution of a program that disrupt the normal flow of instructions.
    // They are typically caused by errors or unexpected conditions, such as invalid input, division by zero, or trying to access an array index that is out of bounds.
    // When an exception occurs, the program can either handle the exception gracefully or terminate abruptly if the exception is not handled.

    //Exceptions can be categorized into two main types: checked exceptions and unchecked exceptions.
    //Checked exceptions are exceptions that must be either caught or declared in the method signature. They are typically used for recoverable conditions, such as file not found or network errors.
    //Unchecked exceptions, also known as runtime exceptions, are exceptions that do not need to be declared or caught.
    // They are typically used for programming errors, such as null pointer exceptions or array index out of bounds exceptions.

    //How to handle exceptions?
    //In Java, exceptions can be handled using try-catch blocks and throws keyword.
    //The code that may throw an exception is placed inside the try block, and the catch block is used to handle the exception.
    //You can have multiple catch blocks to handle different types of exceptions, and you can also use a finally block to execute code that must run regardless of whether an exception was thrown or caught.

    //Expllicitly throwing exceptions can be done using the throw keyword, which allows you to create and throw an exception manually.
    //This is often used to signal that a method has encountered an error condition that it cannot handle.






    public static void main(String[] args) {
        //Example of an unchecked exception (RuntimeException)
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); // This will throw an ArrayIndexOutOfBoundsException

        //Example of a checked exception (IOException)
        //FileReader file = new FileReader("nonexistentfile.txt"); // This will throw a FileNotFoundException
    }
}
