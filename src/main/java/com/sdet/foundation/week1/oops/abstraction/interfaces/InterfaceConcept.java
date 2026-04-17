package com.sdet.foundation.week1.oops.abstraction.interfaces;

public class InterfaceConcept {
    //What are interfaces in Java?
    //Interfaces in Java are a fundamental part of the language that allow you to define a contract for classes to implement.
    //An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
    //Interfaces cannot contain instance fields or constructors. A class can implement multiple interfaces, which allows for a form of multiple inheritance in Java.

    //What are the key features of interfaces in Java?
    //Interfaces in Java have several key features that make them a powerful tool for designing and implementing software. Here are some of the key features of interfaces in Java:
    //1. Method Signatures: Interfaces can declare methods, but they cannot provide implementations for those methods (until Java 8, after which they can also have default and static methods). The methods declared in an interface are implicitly public and abstract.
    //2. Constants: Interfaces can declare constants (static final variables). These constants are implicitly public, static, and final.
    //3. Multiple Inheritance: A class can implement multiple interfaces, allowing it to inherit behavior from multiple sources. This is a way to achieve multiple inheritance in Java, which is not possible with classes alone.
    //4. Default Methods: Starting from Java 8, interfaces can have default methods, which are methods with a default implementation. This allows developers to add new methods to interfaces without breaking existing implementations.
    //5. Static Methods: Interfaces can also have static methods, which are methods that belong to the interface itself rather than to any instance of the interface. Static methods in interfaces can be called without an instance of the interface.
    //6. No Instance Variables: Interfaces cannot have instance variables or constructors. They are purely a contract for behavior, and any state must be managed by the implementing classes.
    //7. Polymorphism: Interfaces allow for polymorphism, as a reference variable of an interface type can refer to an object of any class that implements the interface. This allows for flexible and extensible code design, as you can write code that works with interfaces rather than specific implementations, making it easier to change implementations without affecting the code that uses the interface.








}
