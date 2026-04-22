package com.sdet.foundation.week1.oops.polymorphism.overriding;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car(); //Reference and Object are of same type
        myCar.start(); // Output: Car is starting with a key.

        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.start(); // Output: Electric Car is starting using push button.

        // Polymorphism: Car reference to ElectricCar object
        Car polymorphicCar = new ElectricCar();  // Reference is of type Car but object is of type ElectricCar


        polymorphicCar.start(); // Output: Electric Car is starting using push button.


        //Casting in polymorphism
        //What is Casting?
        // Casting is the process of converting one data type into another.
        // In the context of polymorphism, it allows us to treat an object of a subclass as an object of its superclass (upcasting) or to access subclass-specific methods by treating a superclass reference as a subclass reference (downcasting).

        int age = 25;
        double doubleAge = age; // Implicit casting (widening conversion)
        System.out.println("Double Age: " + doubleAge); // Output: Double Age:


        float price = 19.99f;
        int intPrice =  (int)price; // Explicit casting (narrowing conversion)
        System.out.println("Integer Price: " + intPrice); // Output: Integer Price: 19

        //What can be casted in polymorphism?
        // In polymorphism, you can cast between a parent class and its child class. This includes:
        //1. Upcasting: Casting a child class object to a parent class reference. This is implicit and does not require an explicit cast. It allows you to treat a subclass object as an instance of its parent class.
        //2. Downcasting: Casting a parent class reference back to a subclass reference.

        //Example of upcasting // Upcasting is implicit and does not require an explicit cast
        Car upcastedCar = new ElectricCar(); // Upcasting to treat ElectricCar as a Car
        upcastedCar.start(); // Output: Electric Car is starting using push button.

        IManageBattery batteryManager = new ElectricCar(); // Upcasting to interface reference
        batteryManager.checkBatteryHealth(); // Output: Checking battery health of the Electric Car.

        //Selenium
        //  WebDriver driver = new ChromeDriver(); // Upcasting to WebDriver interface
        // WebDriver driver = new FirefoxDriver(); // Upcasting to WebDriver interface
        //  WebDriver driver = new SafariDriver(); // Upcasting to WebDriver interface
        //  driver.get("https://www.example.com"); // Output: This will work because ChromeDriver implements WebDriver interface.

        //Example of downcasting
        //Downcasting requires an explicit cast and should be done with caution to avoid ClassCastException at runtime

        //ElectricCar electricCarReference = (ElectricCar) new Car(); // Downcasting to access ElectricCar specific methods if needed

        //electricCarReference.start(); // Output: This will throw a ClassCastException at runtime because the object being cast is not actually an instance of ElectricCar.



    }
}
