package com.sdet.foundation.week1.oops.interitance.multiple;
//ISP - Interface Segregation Principle

public class HybridCar implements ICar, IElectricCar,IPetrolCar {
    //This class implements both ICar and IElectricCar interfaces, which means it must provide implementations for all the methods declared in both interfaces.
    // The HybridCar class has three private instance variables: make, model, and year, which represent the make, model, and manufacturing year of the car, respectively.
    // The constructor of the HybridCar class initializes these instance variables when a new HybridCar object is created.

    private String make;
    private String model;
    private int year;

    public HybridCar(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayCarInfo() {
        System.out.println("HybridCar Make: " + make);
        System.out.println("HybridCar Model: " + model);
        System.out.println("HybridCar Year: " + year);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void refuel() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void chargeBattery() {

    }

    @Override
    public void displayBatteryStatus() {

    }
}
