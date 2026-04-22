package com.sdet.foundation.week1.keywords;

public class FinalKeyword {
    final int MAX_SPEED = 120; // A final variable cannot be changed once initialized

    public void displayMaxSpeed() {
        System.out.println("The maximum speed is: " + MAX_SPEED);
    }

    public static void main(String[] args) {
        FinalKeyword car = new FinalKeyword();
        car.displayMaxSpeed();

        // Uncommenting the following line will cause a compilation error
        // because MAX_SPEED is a final variable and cannot be reassigned.
        // car.MAX_SPEED = 150; // This will cause an error
    }

}
