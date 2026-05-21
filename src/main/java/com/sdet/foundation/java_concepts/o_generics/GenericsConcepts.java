package com.sdet.foundation.java_concepts.o_generics;

import com.sdet.foundation.java_concepts.m_streams.concepts.Employee;

import java.util.ArrayList;

public class GenericsConcepts {



    public static void main(String[] args) {
        withTypeSafety();
    }





    public static void withTypeSafety(){
        ArrayList<String> booksList = new ArrayList<>();
        booksList.add("Psychology of Money");
        booksList.add("Rich Dad Poor Dad");
        //booksList.add(234567);
        //booksList.add(true);
        //booksList.add(34567.4543);

        //Employee employee1 = new Employee("Amit", 23,54000,"IT");
        //booksList.add(employee1);

        for(String book : booksList){
            System.out.println(book);
        }
    }

    public static void withoutTypeSafety(){
        ArrayList booksList = new ArrayList();
        booksList.add("Psychology of Money");
        booksList.add("Rich Dad Poor Dad");
        booksList.add(234567);
        booksList.add(true);
        booksList.add(34567.4543);

        Employee employee1 = new Employee("Amit", 23,54000,"IT");
        booksList.add(employee1);

        for(Object book : booksList){
            System.out.println((String)book);// We're going to get Class Cast Exception as Compiler can't convert Integer value in String
        }
    }
}
