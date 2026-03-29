package com.sdet.foundation.week1.collections.map;

import java.util.TreeMap;

public class TreeMapConcepts {
    public static void main(String[] args) {
        //TreeMap is a collection that stores key-value pairs and is based on the natural ordering of the keys. It is part of the Java Collections Framework and implements the Map interface.

        //TreeMap does not allow null keys. If you try to add a null key to a TreeMap, it will throw a NullPointerException.

        //TreeMap allows null values. You can add a null value to a TreeMap, but only one null value is allowed for each key.

        //TreeMap maintains a sorted order of its keys. The order of keys in a TreeMap is determined by their natural ordering (if they implement the Comparable interface) or by a Comparator provided at the time of TreeMap creation.

        //TreeMap provides logarithmic time performance for basic operations like put, get, remove, and containsKey, assuming the keys are properly ordered.

        //TreeMap is not synchronized, which means that if multiple threads access a TreeMap concurrently and at least one of the threads modifies the map structurally, it must be synchronized externally.
        TreeMap <String, String> capitalCities = new TreeMap<>();
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("UK", "London");
        System.out.println("After Adding  " + capitalCities);
        capitalCities.put("USA", "New York");
        System.out.println("After Adding duplicate key 'USA' " + capitalCities);

        // Attempting to add null key
        try {
            capitalCities.put(null, "Null City");
        } catch (NullPointerException e) {
            System.out.println("Cannot add null key to TreeMap: " + e.getMessage());
        }
        // Adding null values
        capitalCities.put("Null Country", null);
        System.out.println("After Adding null value " + capitalCities);
        // Checking if the TreeMap contains a specific key or value
        boolean containsUSA = capitalCities.containsKey("USA");
        boolean containsNewDelhi = capitalCities.containsValue("New Delhi");
        System.out.println("Does the TreeMap contain key 'USA'? " + containsUSA);
        System.out.println("Does the TreeMap contain value 'New Delhi'? " + containsNewDelhi);
        // Removing an entry from the TreeMap
        capitalCities.remove("UK");
        System.out.println("After Removing key 'UK' " + capitalCities);
        // Iterating over the entries in the TreeMap
        System.out.println("Iterating over the TreeMap:");
        for (java.util.Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
        //Using iterator to iterate over the TreeMap
        System.out.println("Iterating over the TreeMap using Iterator:");
        java.util.Iterator<java.util.Map.Entry<String, String>> iterator = capitalCities.entrySet().iterator();
        while (iterator.hasNext()) {
            java.util.Map.Entry<String, String> entry = iterator.next();
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
        // Clearing the TreeMap
        capitalCities.clear();
        System.out.println("After Clearing the TreeMap " + capitalCities);
        // Adding new entries to the TreeMap
        capitalCities.put("France", "Paris");
        capitalCities.put("Ghana", "Accra");
        System.out.println("After Adding new entries " + capitalCities);
        //CRUD Operations
        //Create -> put()
        //Read -> get(), containsKey(), containsValue(), forEach(), size(), isEmpty
        //Update -> put() with existing key
        //Delete -> remove()
        //It performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
        // Unless otherwise specified by the implementing class, actions are performed in the order of iteration
        // (if an iteration order is specified). Exceptions thrown by the action are relayed to the caller.
        //Using ForEach method to iterate over the TreeMap
        System.out.println("Iterating over the TreeMap using ForEach:");
        capitalCities.forEach((country, capital) -> {
            System.out.println("The capital of " + country + " is " + capital);
            if (country.equals("France") || country.equals("Germany")) {
                System.out.println(country + " is a country in Europe");
            }
        });
    }
    }

