package com.sdet.foundation.week1.collections.set;

import java.util.Set;

public class HashSetConcepts {
    public static void main(String[] args) {
        //HashSet is a collection that contains no duplicate elements and is based on the hash code of the objects. It is part of the Java Collections Framework and implements the Set interface.

        //HashSet does not allow duplicate elements. If you try to add a duplicate element, it will simply ignore it and not throw an error.

        //HashSet allows one null element. You can add a null value to a HashSet, but only one null value is allowed. If you try to add another null value, it will be ignored as a duplicate.

        //HashSet does not maintain any order of its elements. The order of elements in a HashSet is not guaranteed to be the same as the order in which they were added.

        //HashSet provides constant time performance for basic operations like add, remove, and contains, assuming the hash function disperses the elements properly across the buckets.

        //HashSet is not synchronized, which means that if multiple threads access a HashSet concurrently and at least one of the threads modifies the set structurally, it must be synchronized externally.
        //Is Hashset thread safe? No, HashSet is not thread safe.
        // If multiple threads access a HashSet concurrently and at least one of the threads modifies the set structurally,
        // it must be synchronized externally to prevent concurrent modification issues.
        Set<String> cars = new java.util.HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("After Adding  " + cars);
        // Attempting to add duplicate elements
        cars.add("BMW");
        System.out.println("After Adding duplicate element 'BMW' " + cars);
        // Adding null values
        cars.add(null);
        System.out.println("After Adding null value " + cars);
        cars.add(null);
        System.out.println("After Adding duplicate null value " + cars);
        // Checking if the HashSet contains a specific element
        boolean containsBMW = cars.contains("BMW");
        System.out.println("Does the HashSet contain 'BMW'? " + containsBMW);
        // Removing an element from the HashSet
        cars.remove("Ford");
        System.out.println("After Removing 'Ford' " + cars);
        // Iterating over the elements in the HashSet
        System.out.println("Iterating over the HashSet:");
        for (String car : cars) {
            System.out.println(car);
        }
        //Using iterator to iterate over the HashSet
        System.out.println("Iterating over the HashSet using Iterator:");
        java.util.Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String car = iterator.next();
            System.out.println(car);
        }
        // Clearing the HashSet
        cars.clear();
        System.out.println("After Clearing the HashSet " + cars);
        // Adding new elements to the HashSet
        cars.add("Tesla");
        cars.add("Audi");
        System.out.println("After Adding new elements " + cars);
        //CRUD Operations
        //Create -> add()
        //Read -> contains(), forEach(), size(), isEmpty
        //Update -> Not applicable for Set as it does not maintain order and does not allow duplicates
        //Delete -> remove()
        //Sorting a HashSet is not possible as it does not maintain any order of its elements.
        //If you need a sorted collection, you can use a TreeSet instead, which maintains a sorted order of its elements based on their natural ordering or a specified comparator.

    }
}
