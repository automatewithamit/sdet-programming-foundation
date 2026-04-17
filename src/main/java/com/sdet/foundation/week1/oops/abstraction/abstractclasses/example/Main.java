package com.sdet.foundation.week1.oops.abstraction.abstractclasses.example;

public class Main {
    public static void main(String[] args) {
        PermanentEmployee permEmp = new PermanentEmployee("Alice", 101, 75000);
        permEmp.displayInfo();
        ContractEmployee contractEmp = new ContractEmployee("Bob", 102, 12);
        contractEmp.displayInfo();

        // Polymorphism: BaseEmployee reference to PermanentEmployee object
        //BaseEmployee emp1 = new BaseEmployee("Charlie", 103, 85000); // This will cause a compilation error because BaseEmployee is abstract
        // emp1.displayInfo();


}
}
