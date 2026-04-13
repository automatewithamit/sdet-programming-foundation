package com.sdet.foundation.week1.collections.list;

import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args) {
        //Collections are used to store group of objects.
        // It is a framework that provides an architecture to store and manipulate the group of objects.

        //Type of Collections
        //List - > ArrayList, LinkedList, Vector, Stack
        //Set -> HashSet, LinkedHashSet, TreeSet
        //Map -> HashMap, LinkedHashMap, TreeMap, Hashtable, Properties
        //Queue -> PriorityQueue, Deque, ArrayDeque
        //List is an ordered collection that allows duplicate elements. It maintains the insertion order and provides positional access to elements.
        ArrayList<String> names = new ArrayList<>();
        String[] name = new String[] {"Trump", "Modi", "Bush"};

        ArrayList<Employee> employees = new ArrayList<>();
        names.add("Trump");
        names.add("Modi");
        names.add("Bush");
        System.out.println("After Adding  "+ names);
        System.out.println(names.get(2));//It returns the element at the specified position in this list.
        names.add(2,"Biden");//It inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
        System.out.println("After Adding at index  "+ names);
        names.remove("Biden");//It removes the first occurrence of the specified element from this list, if it is present. If this list does not contain the element, it is unchanged. Shifts any subsequent elements to the left (subtracts one from their indices).
        System.out.println("After Removal using Object "+ names);
        names.remove(2);//It removes the element at the specified position in this list. Shifts any subsequent elements to the left (subtracts one from their indices).
        System.out.println("After Removal at index  "+ names);

        names.set(1,"Putin"); //It replaces the element at the specified position in this list with the specified element.
        System.out.println("After Updating at index  "+ names);
        names.clear(); //It removes all of the elements from this list. The list will be empty after this call returns.
        System.out.println("After Clearing the List  "+ names);
        ArrayList<String> primeMinsiterNames = new ArrayList<>();
        primeMinsiterNames.add("Modi");
        primeMinsiterNames.add("Trudeau");
        primeMinsiterNames.add("Trump");
        names.addAll(primeMinsiterNames); //It appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
        System.out.println("After Adding another List  "+ names);
        names.addFirst("Putin"); //It inserts the specified element at the beginning of this list.
        System.out.println("After Adding at First index  "+ names);
        names.addLast("Biden"); //It appends the specified element to the end of this list.
        System.out.println("After Adding at Last index  "+ names);
        names.contains("Modi"); //It returns true if this list contains the specified element.
        System.out.println("Does List contains Modi ? "+ names.contains("Modi"));
        names.forEach(name1 -> System.out.println(name1 + " Sirname")); //It performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception. Unless otherwise specified by the implementing class, actions are performed in the order of iteration (if an iteration order is specified). Exceptions thrown by the action are relayed to the caller.
        names.forEach(nameWithCountry -> {


            System.out.println(nameWithCountry + " is a Prime Minister of India or Canada or USA");
            System.out.println(nameWithCountry + " is a President of India or Canada or USA");

        }); //It performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception. Unless otherwise specified by the implementing class, actions are performed in the order of iteration (if an iteration order is specified). Exceptions thrown by the action are relayed to the caller.
        names.indexOf("Modi"); //It returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println("Index of Modi is : "+ names.indexOf("Modi"));
        //CRUD Operations
        //Create - > add(), addAll()
        //Read -> get(), contains(), indexOf(), forEach(),  size(), isEmpty()
        //Update -> set(), add(index, element), addFirst(), addLast()
        //Delete -> remove(), clear(), removeAll(), removeFirst(), removeLast()

    }
}
