package com.sdet.foundation.week1.streams.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class StreamConcepts {


    //Program to make each name in a Collection to uppercase and print them
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        upperCaseWithoutStream(names);
        upperCaseWithStream(names);


        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        isEvenOrOddWithStream(numbers);

//        // Using Stream to convert each name to uppercase and print them
//        System.out.println("Names in uppercase:");
//        java.util.Arrays.stream(names)
//                .map(String::toUpperCase) // Convert each name to uppercase
//                .forEach(System.out::println); // Print each name
    }

    public static void isEvenOrOddWithStream(Integer[] numbers){
        Arrays.stream(numbers).map(
                num -> {
                            if(num%2==0){
                                return num + " is even";
                            }else {
                                return num + " is odd";
                            }
                }
        ).forEach(System.out::println);

        Arrays.stream(numbers).filter(num -> num%2==0).forEach(System.out::println);
        //int Integer

    }


    public static void createStreamFromList(){
        //We can use Stream on any Collection or Array
        System.out.println("Names in uppercase using Stream:");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        Set<String> nameSet = Set.of("Alice", "Bob", "Charlie", "David", "Eve");
        nameSet.stream().map(String::toUpperCase)//Converting each name to uppercase
                            .forEach(System.out::println);//Printing each name

        names.stream().map(String::toUpperCase)//Converting each name to uppercase
                            .forEach(System.out::println);//Printing each name
    }

    public static void createStreamFromArray(String[] names){
        //We can use Stream on any Collection or Array
        System.out.println("Names in uppercase using Stream:");
        Arrays.stream(names).map(String::toUpperCase)//Converting each name to uppercase
                            .forEach(System.out::println);//Printing each name
    }



    public static void upperCaseWithoutStream(String[] names){
        System.out.println("Names that start with A in uppercase without using Stream:");
        for(String name : names) {//Iterating through each name in the array
            if(name.startsWith("A")) {//Filtering names that start with "A"
                System.out.println(name.toUpperCase());//Converting the name to uppercase and printing it
            }
        }
    }
    public static void upperCaseWithStream(String[] names){
        //We can use Stream on any Collection or Array
        System.out.println("Names that start with A in uppercase using Stream:");
        Arrays.stream(names).filter(name -> name.startsWith("A"))//Filtering names that start with "A"
                            .forEach(System.out::println);

//        for(String name : names) {//Iterating through each name in the array
//            if(name.startsWith("A")) {//Filtering names that start with "A"
//                System.out.println(name.toUpperCase());//Converting the name to uppercase and printing it
//            }
//        }
    }



}
