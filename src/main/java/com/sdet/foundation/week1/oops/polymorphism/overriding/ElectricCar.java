package com.sdet.foundation.week1.oops.polymorphism.overriding;

public class ElectricCar extends Car implements IManageBattery {

    @Override
    public void start() {
        System.out.println("Electric Car is starting using push button.");
    }

    public void charge() {
        System.out.println("Electric Car is charging.");
    }

    @Override
    public void checkBatteryHealth() {
        System.out.println("Checking battery health of the Electric Car.");
    }
}
