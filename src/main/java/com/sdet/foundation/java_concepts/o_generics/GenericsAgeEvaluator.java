package com.sdet.foundation.java_concepts.o_generics;

public class GenericsAgeEvaluator {
    /**
     * Generic Method to compare the age of two Person objects and return the older one.
     *
     * @param <T>   A placeholder that must be a subtype of Person
     * @param p1    First object (can be Student or Employee)
     * @param p2    Second object (can be Student or Employee)
     * @return      The older object of type T (or Person)
     */
    public static <T extends Person> T getOlderPerson(T p1, T p2) {
        // Because <T extends Person>, Java guarantees .getAge() exists on both objects
        if (p1.getAge() >= p2.getAge()) {
            return p1;
        } else {
            return p2;
        }
    }
}
