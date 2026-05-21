package com.sdet.foundation.java_concepts.j_oops.abstraction.abstractclasses.example;

public class ContractEmployee extends BaseEmployee{

        private int contractDuration; // in months

        public ContractEmployee(String name, int id, int contractDuration) {
            super(name, id);
            this.name = name;
            this.id = id;
            this.contractDuration = contractDuration;
        }
    public void displayInfo() {
        System.out.println("\nContract Employee Details:");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Contract Duration: " + contractDuration + " months");
    }


}
