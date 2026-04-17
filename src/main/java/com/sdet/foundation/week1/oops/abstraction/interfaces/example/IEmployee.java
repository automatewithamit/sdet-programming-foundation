package com.sdet.foundation.week1.oops.abstraction.interfaces.example;

public interface IEmployee extends IBaseEmployee {
    public String DEPARTMENT = "Engineering"; // This is a constant, and it is implicitly public, static, and final.
    //Example of Instance Variable in Interface
    //In Java, interfaces cannot have instance variables. However, they can have constants (static final variables) and static methods. If you try to declare an instance variable in an interface, it will result in a compilation error. For example, the following code will not compile:
    //public String name; // This will give a compilation error because instance variables are not allowed in interfaces.
    public String name = "John Doe"; // This is a constant, and it is implicitly public, static, and final. It cannot be modified.




    //1. Method Signatures: Interfaces can declare methods, but they cannot provide implementations for those methods (until Java 8, after which they can also have default and static methods).
    // The methods declared in an interface are implicitly public and abstract.
    void displayInfo();

    //what are static methods in interfaces?
    //Static methods in interfaces are methods that belong to the interface itself rather than to any instance of the interface.
    // They can be called without an instance of the interface and are defined using the static keyword. Static methods in interfaces can provide utility functions related to the interface, and they can be called using the interface name.
    // For example: IEmployee.staticMethod();
    //Static methods get called automatically when the interface is loaded, and they cannot be overridden by implementing classes. They are useful for providing common functionality that is related to the interface but does not depend on instance variables or methods.
    static void staticMethod() {
        System.out.println("This is a static method in the IEmployee interface.");
    }

    //What are default methods in interfaces?
    //Default methods in interfaces are methods that have a default implementation. They are defined using the default keyword and can be overridden by implementing classes if needed. Default methods allow developers to add new methods to interfaces without breaking existing implementations, as classes that implement the interface will automatically inherit the default implementation if they do not provide their own implementation.

    default void defaultMethod() {
        System.out.println("This is a default method in the IEmployee interface.");
    }


    //2. Constants: Interfaces can declare constants (static final variables). These constants are implicitly public, static, and final.

    public static final String COMPANY_NAME = "Tech Solutions Inc.";

    //COMPANY_NAME = "New Company Name"; // This will give a compilation error because constants cannot be modified.


}
