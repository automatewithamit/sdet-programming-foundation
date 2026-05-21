package com.sdet.foundation.java_concepts.e_control_statements_loops;

public class ForEachLoop {

    // Foreach loop is very useful with Collections [ SingleDimensionArrays, Lists etc ]
    public static void main(String[] args) {

        String[] students = {"Amit", "Sonal", "Ramesh"};

        for(String student : students){
            System.out.println(student);
        }


    }
}
