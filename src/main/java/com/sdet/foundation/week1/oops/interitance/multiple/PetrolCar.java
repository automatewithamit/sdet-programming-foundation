package com.sdet.foundation.week1.oops.interitance.multiple;

public class PetrolCar implements  IPetrolCar {
    @Override
    public void start() {
        System.out.println("Petrol Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Car is stopping...");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the Petrol Car...");
    }
}
