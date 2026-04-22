package com.sdet.foundation.week1.oops.polymorphism.overriding.advancedexample;

public class PetrolCar extends Car {
    public void start() {
        System.out.println("Petrol Car is starting with a key and fuel.");
    }

    public void stop() {
        System.out.println("Petrol Car is stopping.");
    }

    public void refuel() {
        System.out.println("Refueling the Petrol Car.");
    }
    public void checkEngine() {
        System.out.println("Checking engine of the Petrol Car.");
    }



}
