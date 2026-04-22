package com.sdet.foundation.week1.oops.polymorphism.overriding.advancedexample;

public class Main {
    public static void main(String[] args) {

        Car mainCar = new Car();

        mainCar.start();
        mainCar.stop();

        Car car = new PetrolCar();
        car.start(); // Calls the overridden start method in PetrolCar
        car.stop();  // Calls the overridden stop method in PetrolCar


        // Creating an instance of SportsCar and assigning it to a Car reference

        Car sportsCar = new SportsCar();
        sportsCar.start(); // Calls the overridden start method in SportsCar
        sportsCar.stop();  // Calls the overridden stop method in SportsCar



        PetrolCar petrolSportsCar = new SportsCar();
        petrolSportsCar.start(); // Calls the overridden start method in SportsCar
        petrolSportsCar.stop();  // Calls the overridden stop method in SportsCar
        petrolSportsCar.refuel(); // Calls the refuel method in PetrolCar
        petrolSportsCar.checkEngine(); // Calls the checkEngine method in PetrolCar









    }
}
