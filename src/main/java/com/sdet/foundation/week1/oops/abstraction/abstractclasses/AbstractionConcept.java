package com.sdet.foundation.week1.oops.abstraction.abstractclasses;

public class AbstractionConcept {
    // Abstraction is the process of hiding implementation details and showing only functionality to the user.
    // It allows us to focus on what an object does instead of how it does it.

    //Types of Abstraction:
    // There are two main types of abstraction in Java:
    //1. Partial Abstraction: Achieved using abstract classes. An abstract class can have both abstract and concrete methods. It can also have instance variables and constructors.
    //2. Full Abstraction: Achieved using interfaces. An interface can only have abstract methods (until Java 8, after which it can also have default and static methods). It cannot have instance variables or constructors.


    // 1. Abstract Classes: A class that cannot be instantiated and may contain abstract methods (methods without a body). Subclasses must provide implementations for the abstract methods.
    //What are Abstract Classes in Java?
    //An abstract class in Java is a class that cannot be instantiated on its own and is meant to be subclassed. It can contain both abstract methods (which are declared without an implementation) and concrete methods (which have an implementation). Abstract classes can also have instance variables and constructors. They are used to provide a common base for subclasses and to define a template for the subclasses to follow.



    // 2. Interfaces: A reference type in Java that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. A class can implement multiple interfaces.



    public static void main(String[] args) {
        // We cannot create an instance of an abstract class
        // Vehicle vehicle = new Vehicle(); // This will give a compilation error

        // We can create an instance of a concrete subclass
        //Car car = new Car();
        //car.startEngine(); // Output: Car engine started.
    }

}
