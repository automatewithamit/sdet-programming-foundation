package com.sdet.foundation.week1.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {
    //HashMap is a collection that stores key-value pairs and is based on the hash code of the keys. It is part of the Java Collections Framework and implements the Map interface.
    //HashMap does not maintain any order of its entries, and it allows one null key and multiple null values.
    //HashMap does not allow duplicate keys. If you try to add a duplicate key, it will simply overwrite the existing value associated with that key and not throw an error.
    //HashMap allows one null key.
    //HashMap provides constant time performance for basic operations like put, get, remove, and
    //Is HashMap thread safe? No, HashMap is not thread safe.
    // If multiple threads access a HashMap concurrently and at least one of the threads modifies the map structurally, it must be synchronized externally to prevent concurrent modification issues.
    public static void main(String[] args) {


        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("UK", "London");
        System.out.println("After Adding  " + capitalCities);
        // Attempting to add duplicate keys
        capitalCities.put("USA", "New York");
        System.out.println("After Adding duplicate key 'USA' " + capitalCities);
        // Adding null key and null values
        capitalCities.put(null, "Null City");
        capitalCities.put("Null Country", null);
        System.out.println("After Adding null key and null value " + capitalCities);
        // Checking if the HashMap contains a specific key or value
        boolean containsUSA = capitalCities.containsKey("USA");
        boolean containsNewDelhi = capitalCities.containsValue("New Delhi");
        System.out.println("Does the HashMap contain key 'USA'? " + containsUSA);
        System.out.println("Does the HashMap contain value 'New Delhi'? " + containsNewDelhi);
        // Removing an entry from the HashMap
        capitalCities.remove("UK");
        System.out.println("After Removing key 'UK' " + capitalCities);
        // Iterating over the entries in the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
        //Using iterator to iterate over the HashMap
        System.out.println("Iterating over the HashMap using Iterator:");
        java.util.Iterator<Map.Entry<String, String>> iterator = capitalCities.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
        // Clearing the HashMap
        capitalCities.clear();
        System.out.println("After Clearing the HashMap " + capitalCities);
        // Adding new entries to the HashMap
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");
        System.out.println("After Adding new entries " + capitalCities);
        //CRUD Operations
        //Create -> put()
        //Read -> get(), containsKey(), containsValue(), forEach(), size(), isEmpty
        //Update -> put() with existing key
        //Delete -> remove()
        //It performs the given action for each entry in this map until all entries have been processed or the action throws an exception. Unless otherwise specified by the implementing class, actions are performed in the order of iteration (if an iteration order is specified). Exceptions thrown by the action are relayed to the caller.
        //Using ForEach method to iterate over the HashMap
        System.out.println("Iterating over the HashMap using ForEach:");
        capitalCities.forEach((country, capital) -> {
                    System.out.println("The capital of " + country + " is " + capital);
                    if (country.equals("France") || country.equals("Germany")) {
                        System.out.println(country + " is a country in Europe");
                    }
                }
        );
        //Using lambda expression to iterate over the HashMap
        //System.out.println("Iterating over the HashMap using Lambda Expression:");
        //capitalCities.entrySet().stream().filter(entry -> entry.getKey().equals("France") || entry.getKey().equals("Germany")).forEach(entry -> System.out.println("The capital of " + entry.getKey() + " is " + entry.getValue() + " and it is a country in Europe"));

    }

}
