package com.sdet.foundation.week1.arrays;

public class SingleDimensionArrays {


    public static void main(String[] args) {
        //SingleDimensionArrays are collections of similar type of data

        //Delclaration of SingleDimensionArrays - > Declared the SingleDimensionArrays + Assigned Values
        int[] marks = {23,65,76,45,87,43,34,34,78,34};
        String[] names = {"Trump","Modi","Bush"};
        String[] cars = new String[] {"Volvo", "BMW", "Ford", "Mazda"};
        boolean[] passFailStatus = {false,true,true,false};
        // Declaration of SingleDimensionArrays
        String[] subjects = new String[5]; //Only 5 Subjects can be added
        subjects[0] = "Maths";
        subjects[1] = "Biology";
        subjects[2] = "Physics";
        subjects[3] = "Psychology";
        subjects[4] = "Science";

        //Assign another value into an array
        subjects[1] = "Astronomy";






        //Access the Values of SingleDimensionArrays

        System.out.println(names[0]); // array starts with 0th index
        System.out.println(names); // prints the address of array

        //Accessing all the elements in an array
        //For Loop
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i]);
        }

        System.out.println("_____________________");
        //For Each Loop
        for(String name:names){
            System.out.println(name);
        }

        System.out.println("_____________________");

        String[]  newSubjects = getSubject();
        System.out.println("New Subjects Are");
        for(String subject:newSubjects){
            System.out.println(subject);
        }


    }

    public static String[] getSubject(){
        String[] subjects = new String[5]; //Only 5 Subjects can be added

        subjects[0] = "Maths";
        subjects[1] = "Biology";
        subjects[2] = "Physics";
        subjects[3] = "Psychology";
        subjects[4] = "Science";

        return  subjects;
    }


}
