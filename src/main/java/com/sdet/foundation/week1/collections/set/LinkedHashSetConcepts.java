package com.sdet.foundation.week1.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetConcepts {
    public static void main(String[] args) {
        //LinkedHashSet is a collection that contains no duplicate elements and maintains the order of insertion. It is part of the Java Collections Framework and implements the Set interface. LinkedHashSet maintains a linked list of the entries in the set, which defines the iteration order (insertion order).

        //LinkedHashSet does not allow duplicate elements. If you try to add a duplicate element, it will simply ignore it and not throw an error.

        //LinkedHashSet allows one null element. You can add a null value to a LinkedHashSet, but only one null value is allowed. If you try to add another null value, it will be ignored as a duplicate.

        //LinkedHashSet maintains the order of insertion of its elements. The order of elements in a LinkedHashSet is the same as the order in which they were added.

        //LinkedHashSet provides constant time performance for basic operations like add, remove, and contains, assuming the hash function disperses the elements properly across the buckets.

        //LinkedHashSet is not synchronized, which means that if multiple threads access a LinkedHashSet concurrently and at least one of the threads modifies the set structurally, it must be synchronized externally.
        LinkedHashSet<String> cars = new LinkedHashSet<>();
        cars.add("Volvo");
    }
}
