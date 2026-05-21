package com.sdet.foundation.java_concepts.m_streams.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsConceptPart5 {


    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        streamUsingPratitioningBy(numbers);
    }

    public static void streamUsingPratitioningBy(Integer[] numbers){

        // Example of partitioning a list of integers into even and odd numbers
        Map<Boolean, List<Integer>> partitionedNumbers = Arrays.stream(numbers).collect(Collectors.partitioningBy(num-> num%2==0));
        System.out.println("Even numbers: " + partitionedNumbers.get(true));
        System.out.println("Odd numbers: " + partitionedNumbers.get(false));

        //String number = Arrays.stream(numbers).collect(Collectors.joining(","));
            List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

            System.out.println(names);
            String joinedNames =names.stream().collect(Collectors.joining(","));
            System.out.println(joinedNames);
    }

}
