package com.sdet.foundation.week1.oops.encapsulation.classes;

import com.sdet.foundation.week1.oops.encapsulation.accessmodifiers.Car;
import com.sdet.foundation.week1.oops.encapsulation.accessmodifiers.ElectricCar;

public class TestCarMain extends  Car {


    public TestCarMain(String make, String model, int year) {
        super(make, model, year);
    }

    public static void main(String[] args) {


        Car car1 = new Car("Toyota", "Camry", 2020);


        System.out.println("HybridCar 1 Make: " + car1.getMake());
        //Protected access modifier allows access within the same package and subclasses,
        // but not from other packages. Since TestCarMain is in a different package than HybridCar, it cannot access the getMake() method of HybridCar, which is protected.
        // Therefore, we will get a compile-time error when trying to access car1.getMake().

        System.out.println("HybridCar 1 Model: " + car1.getModel());
        System.out.println("HybridCar 1 Year: " + car1.getYear());

        ElectricCar electricCar1 = new ElectricCar("Tesla", "Model S", 2022, 100.0);
        System.out.println("Electric HybridCar 1 Make: " + electricCar1.getMake());
        System.out.println("Electric HybridCar 1 Model: " + electricCar1.getModel());
        System.out.println("Electric HybridCar 1 Year: " + electricCar1.getYear());
        System.out.println("Electric HybridCar 1 Battery Capacity: " + electricCar1.getBatteryCapacity() + " kWh");
    }
}
