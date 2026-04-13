package com.sdet.foundation.week1.collections.list;

import java.util.LinkedList;

public class LinkedListConcepts {
    public static void main(String[] args) {
        //LinkedList is a linear data structure that consists of a sequence of nodes,
        // where each node contains data and a reference (or link) to the next node in the sequence. It is a dynamic data structure that can grow or shrink in size as needed, making it more flexible than arrays.
      //Difference between ArrayList and LinkedList
        //1. ArrayList is based on a dynamic array, while LinkedList is based on a doubly linked list.
        //2. ArrayList provides faster access to elements as it uses an index-based approach, while LinkedList requires traversal to access elements.
        //3. ArrayList is more efficient for storing and accessing data, while LinkedList is more efficient for inserting and deleting elements.
        //4. ArrayList has a smaller memory footprint compared to LinkedList, as it does not require additional memory for storing references to the next and previous nodes.

        //Define LinkedList
        //Benefit of LinkedList over ArrayList
        //1. LinkedList allows for efficient insertion and deletion of elements, as it does not require shifting of elements like in an ArrayList. This makes it a better choice when you need to frequently add or remove elements from the list.
        //2. LinkedList can grow and shrink dynamically, while ArrayList has a fixed size. This means that LinkedList can handle a varying number of elements without the need for resizing, which can be costly in terms of performance.
        //3. LinkedList can be used to implement other data structures such as stacks and queues, while ArrayList is primarily designed for random access and is not as efficient for implementing these types of data structures.
        LinkedList<String> cars = new LinkedList<>();
        //Clone a LinkedList
        //Example of cloning a LinkedList

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("After Adding  " + cars);


        LinkedList<String> newCars = (LinkedList<String>) cars.clone();

        System.out.println("Cloned list (newCars): " + newCars);

        // Modify the cloned list and show that original and clone are different lists (shallow copy of elements)
        newCars.add("Tesla");
        newCars.remove("Ford");

        System.out.println("After modifying clone - original cars: " + cars);
        System.out.println("After modifying clone - cloned newCars: " + newCars);

        System.out.println(cars.get(2));//It returns the element at the specified position in this

    }
}
