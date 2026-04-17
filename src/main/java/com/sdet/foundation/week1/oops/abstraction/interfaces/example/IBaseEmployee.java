package com.sdet.foundation.week1.oops.abstraction.interfaces.example;

public interface IBaseEmployee  {
    void work();
    static void companyPolicy() {
        System.out.println("Company Policy: Employees must adhere to the code of conduct and maintain professionalism at all times.");
    }
}
