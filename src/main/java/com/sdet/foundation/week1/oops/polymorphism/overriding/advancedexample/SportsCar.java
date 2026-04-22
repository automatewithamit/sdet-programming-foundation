package com.sdet.foundation.week1.oops.polymorphism.overriding.advancedexample;

public class SportsCar extends PetrolCar{
    public void start() {
        System.out.println("SportsCar is starting with a push button.");
    }

    public void stop() {
        System.out.println("SportsCar is stopping.");
    }

    public  void turboBoost() {
        System.out.println("Activating turbo boost in the SportsCar.");
    }
}
