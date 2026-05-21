package com.sdet.foundation.java_concepts.o_generics;

import java.util.List;

import static com.sdet.foundation.java_concepts.o_generics.GenericsAgeEvaluator.getOlderPerson;

public class GenericMethodCreation {


    public static void main(String[] args) {
        Student student1 = new Student("Amit", 21);
        Employee employee1 = new Employee("Saurav", 32);

        // Scenario A: Comparing a Student vs an Employee
        // Java infers <T> as the common parent interface 'Person'
        Person olderMatch = getOlderPerson(student1, employee1);

        // Output: Older is: Employee: Saurav (Age: 32)
        System.out.println("Older is: " + olderMatch);


        // Scenario B: Comparing two Students
        // Java infers <T> specifically as 'Student'
        Student student2 = new Student("Sam", 25);
        Student olderStudent = getOlderPerson(student1, student2);

        // Output: Older Student is: Student: Sam (Age: 25)
        System.out.println("Older Student is: " + olderStudent);
    }
    //access_modifier   <T>   return_type   method_name ( parameters ) { ... }

    public <T> String returnName(String name){
        return "Amit";
    }
    public <T> T returnStudentName(T name){
        T nameOfStudent = null;


        return nameOfStudent;
    }

    public static <T> T selectFirstOption(String elementId, List<T> options) {
        System.out.println("Navigating to UI element: " + elementId);

        if (options == null || options.isEmpty()) {
            return null;
        }

        T selectedItem = options.get(0); // Pick the first item dynamically
        System.out.println("Successfully selected option: " + selectedItem);
        return selectedItem;
    }




}
