package com.sdet.foundation.java_concepts.o_generics;

public class SmartBox<T>{

    private T content;//It can hold any type of Data

    public void add(T item) {//It can accept any Type of Data
        this.content = item;
    }

    public T get() {//It can return any Type of Data
        return content;
    }
}
