package com.sdet.foundation.week1.oops.interitance;

    public class Child extends Parent {

    String schoolName;


    public Child() {
        super();
    }

    // 2. Super Keyword is user to call a method from the parent class that has been overridden in the child class.
    public void displayInfo() {
        super.displayInfo(); // Calling the displayInfo() method from the Parent class using 'super'
        super.age = 10; // Accessing the 'age' variable from the Parent class using 'super'
        System.out.println("Child is : " + this.name + " and age is : " + this.age + " and school name is : " + this.schoolName);
    }




    // The Child class can use the displayMessage() method from the Parent class
}
