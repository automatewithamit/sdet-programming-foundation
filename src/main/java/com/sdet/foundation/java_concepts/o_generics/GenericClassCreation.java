package com.sdet.foundation.java_concepts.o_generics;

import java.util.ArrayList;

public class GenericClassCreation {


    public static void main(String[] args) {
        // Create a box strictly for Strings
        SmartBox<String> stringBox = new SmartBox<>();

        stringBox.add("Hello Generics");
        String str = stringBox.get(); // No casting required

        // Reuse the exact same class to make a box strictly for Integers!
        SmartBox<Integer> intBox = new SmartBox<>();
        intBox.add(42);
        int num = intBox.get();
    }

}
