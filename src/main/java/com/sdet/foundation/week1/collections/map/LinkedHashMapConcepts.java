package com.sdet.foundation.week1.collections.map;

public class LinkedHashMapConcepts {
    //LinkedHashMap is a collection that stores key-value pairs and maintains the order of insertion. It is part of the Java Collections Framework and implements the Map interface. LinkedHashMap maintains a doubly-linked list running through all of its entries, which defines the iteration order (insertion order).
    //LinkedHashMap does not allow duplicate keys. If you try to add a duplicate key, it will simply overwrite the existing value associated with that key and not throw an error.
    //LinkedHashMap allows one null key and multiple null values.
    //LinkedHashMap provides constant time performance for basic operations like put, get, remove, and containsKey, assuming the hash function disperses the elements properly across the buckets.
    //LinkedHashMap is not synchronized, which means that if multiple threads access a LinkedHashMap concurrently and at least one of the threads modifies the map structurally, it must be synchronized externally.
    public static void main(String[] args) {
        // You can implement the LinkedHashMap concepts here similar to how we implemented HashMap and TreeMap concepts in their respective classes.

    }
}
