package com.sdet.foundation.week1.oops.accessmodifiers;

public class ElectricCar {
        private String make;
        private String model;
        private int year;
        private double batteryCapacity;

        // Constructor
        public ElectricCar(String make, String model, int year, double batteryCapacity) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.batteryCapacity = batteryCapacity;
        }

        // Getter and Setter for make
        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        // Getter and Setter for model
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        // Getter and Setter for year
        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        // Getter and Setter for batteryCapacity
        public double getBatteryCapacity() {
            return batteryCapacity;
        }

        public void setBatteryCapacity(double batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
        }
}
