package com.sdet.foundation.week1.oops.accessmodifiers;

public class TestingCar{
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);

        System.out.println("Car 1 Make: " + car1.getMake());
        System.out.println("Car 1 Model: " + car1.getModel());
        System.out.println("Car 1 Year: " + car1.getYear());

        ElectricCar electricCar1 = new ElectricCar("Tesla", "Model S", 2022, 100.0);
        System.out.println("Electric Car 1 Make: " + electricCar1.getMake());
        System.out.println("Electric Car 1 Model: " + electricCar1.getModel());
        System.out.println("Electric Car 1 Year: " + electricCar1.getYear());
        System.out.println("Electric Car 1 Battery Capacity: " + electricCar1.getBatteryCapacity() + " kWh");
    }
}
