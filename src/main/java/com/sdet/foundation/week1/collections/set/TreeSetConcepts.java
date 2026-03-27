package com.sdet.foundation.week1.collections.set;

import java.util.TreeSet;

public class TreeSetConcepts {
    public static void main(String[] args) {
        //TreeSet is a collection that contains no duplicate elements and is based on the natural ordering of the elements. It is part of the Java Collections Framework and implements the Set interface. TreeSet maintains a sorted order of its elements, and it does not allow null values.

        //TreeSet does not allow duplicate elements. If you try to add a duplicate element, it will simply ignore it and not throw an error.

        //TreeSet does not allow null values. If you try to add a null value to a TreeSet, it will throw a NullPointerException.

        //TreeSet maintains a sorted order of its elements. The order of elements in a TreeSet is determined by their natural ordering (if they implement the Comparable interface) or by a Comparator provided at the time of TreeSet creation.

        //TreeSet provides logarithmic time performance for basic operations like add, remove, and contains, assuming the elements are properly ordered.

        //TreeSet is not synchronized, which means that if multiple threads access a TreeSet concurrently and at least one of the threads modifies the set structurally, it must be synchronized externally.

        TreeSet<String> cars = new TreeSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("After Adding  " + cars);
        // Attempting to add duplicate elements
        cars.add("BMW");
        System.out.println("After Adding duplicate element 'BMW' " + cars);
        // Adding null values
        try {
            cars.add(null);
        } catch (NullPointerException e) {
            System.out.println("Cannot add null value to TreeSet: " + e.getMessage());
        }
        // Checking if the TreeSet contains a specific element
        boolean containsBMW = cars.contains("BMW");
        System.out.println("Does the TreeSet contain 'BMW'? " + containsBMW);
        // Removing an element from the TreeSet
        cars.remove("Ford");
        System.out.println("After Removing 'Ford' " + cars);
        // Iterating over the elements in the TreeSet
        System.out.println("Iterating over the TreeSet:");
        for (String car : cars) {
            System.out.println(car);
        }
        //Using iterator to iterate over the TreeSet
        System.out.println("Iterating over the TreeSet using Iterator:");
        java.util.Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String car = iterator.next();
            System.out.println(car);
        }
        // Clearing the TreeSet
        cars.clear();
        System.out.println("After Clearing the TreeSet " + cars);
        // Adding new elements to the TreeSet
        cars.add("Tesla");
        cars.add("Audi");
        System.out.println("After Adding new elements " + cars);



    }
}
