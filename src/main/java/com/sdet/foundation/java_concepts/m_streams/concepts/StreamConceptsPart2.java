package com.sdet.foundation.java_concepts.m_streams.concepts;

import java.util.*;
import java.util.stream.Collectors;

public class StreamConceptsPart2 {


    public static void main(String[] args) {
        Integer[] numbers = {4,7,2,5};
        multiplyByTwo(numbers);
        System.out.println("-------------------------");

        List<Integer> processedResult = streamsCollectMethod(numbers);
        System.out.println(processedResult);
        String[] countryNames = {"India","USA", "France", "Germany","Combodia"};
        streamsForEachMethod(countryNames);
        System.out.println("Sorted Countries : ");
        sortCountriesUsingStream(countryNames);
        sortReversedOrderCountriesUsingStream(countryNames);
        System.out.println("Distinct numbers : ");
            distinctUsingStreams();
    }

    public static void multiplyByTwo(Integer[] numbers) {
        Arrays.stream(numbers).filter(num -> num%2==0)
                                .map(num-> num*2)
                                .forEach(System.out:: println);

    }
    public static List<Integer>  streamsCollectMethod(Integer[] numbers) {
        List<Integer> result =  Arrays.stream(numbers).filter(num -> num%2==0)
                .map(num-> num*2).collect(Collectors.toList());
            return result;

    }
    public static void streamsForEachMethod(String[] countryNames){
        System.out.println("Countries that contain 'ia' : ");
        Optional firstCountry = Arrays.stream(countryNames).filter(country-> country.contains("ia")).findAny();
                        //.forEach(System.out::println);
        if(firstCountry.isPresent()){
            System.out.println(firstCountry.get());
        }else {            System.out.println("No country found with the specified condition.");
        }
    }


    public static void sortCountriesUsingStream(String[] countryNames){
        Arrays.stream(countryNames).sorted().forEach(System.out::println);

    }
    public static void sortReversedOrderCountriesUsingStream(String[] countryNames){
        //Arrays.stream(countryNames).sorted().forEach(System.out::println);
        //reverse order
        System.out.println("Sorted Countries in reverse order : ");
        Arrays.stream(countryNames).sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
    public static void distinctUsingStreams(){
        List<Integer> nums = Arrays.asList(1,1,2,2,3,3);
        nums.stream()
                .distinct()
                .forEach(System.out::println);
    }




}
