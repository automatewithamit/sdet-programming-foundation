package com.sdet.foundation.week1.oops.interitance;

public class GrandParent{
    String name;
    int age;
    public GrandParent() {
        // Call the constructor of the Object class (the default superclass)
    }


    public GrandParent(String name, int age) {
        super(); // this super keyword is used to call the constructor of the parent class (Object class in this case)
        this.name = name; // 'this' refers to the current instance variable 'name'
        this.age = age;   // 'this' refers to the current instance variable 'age
    }

    public void displayGrandParentInfo() {
        System.out.println("GrandParent is : " + this.name + " and age is : " + this.age);
    }
}
