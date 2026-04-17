package com.sdet.foundation.week1.oops.abstraction.abstractclasses;

import com.sdet.foundation.week1.collections.list.Employee;

public abstract class Vehicle {
    // Abstract method (no implementation)
    //1, An abstract method is a method that is declared without an implementation (without a body). It is meant to be overridden by subclasses that provide a specific implementation for the method. Abstract methods can only be declared in abstract classes or interfaces. They serve as a template for subclasses, ensuring that certain methods are implemented in the subclasses. When a subclass extends an abstract class or implements an interface, it must provide an implementation for all abstract methods declared in the parent class or interface, unless the subclass is also declared as abstract.

    //Example of instance variables and constructors in an abstract class
    protected String brand;
    public Employee employee;



    //What is an Abstract Method in Java?
    //An abstract method in Java is a method that is declared without an implementation (without a body). It is meant to be overridden by subclasses that provide a specific implementation for the method. Abstract methods can only be declared in abstract classes or interfaces. They serve as a template for subclasses, ensuring that certain methods are implemented in the subclasses. When a subclass extends an abstract class or implements an interface, it must provide an implementation for all abstract methods declared in the parent class or interface, unless the subclass is also declared as abstract.
    public abstract void startEngine();

    // Concrete method (with implementation)
    public void stopEngine() {
        System.out.println("Vehicle engine stopped.");
    }

    //Abstract Classes can have both abstract and concrete methods. They can also have instance variables and constructors. They are used to provide a common base for subclasses and to define a template for the subclasses to follow.


}
