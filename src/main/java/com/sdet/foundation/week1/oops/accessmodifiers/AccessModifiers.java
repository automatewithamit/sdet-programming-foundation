package com.sdet.foundation.week1.oops.accessmodifiers;

public class AccessModifiers {

    //What are access modifiers?
    //Access modifiers are keywords in Java that determine the visibility and accessibility of classes, methods, and variables. They control how other parts of the code can interact with these elements, providing a way to encapsulate and protect data.
    // The main access modifiers in Java are public, private, protected, and default (no modifier).


    //Types of access modifiers:
    //1. Public: The public access modifier allows the class, method, or variable to be accessed from any other class in any package. It provides the least restrictive access level.
    //2. Private: The private access modifier restricts access to the class, method, or variable to only within the same class. It provides the most restrictive access level, ensuring that the element cannot be accessed from outside the class.
    //3. Protected: The protected access modifier allows access to the class, method, or variable from within the same package and from subclasses (even if they are in different packages). It provides a moderate level of access control, allowing for inheritance while still restricting access from unrelated classes.
    //4. Default (no modifier): If no access modifier is specified, the default access level is applied. This means that the class, method, or variable can be accessed from any class within the same package, but not from classes in different packages. It provides a level of access control that is more restrictive than public but less restrictive than private.

    public String publicVariable = "This is a public variable";
    private String privateVariable = "This is a private variable";
    protected String protectedVariable = "This is a protected variable";
    String defaultVariable = "This is a default variable";
    //Example of protected access modifier:
    // In the Car class, we have a protected variable called "make". This means that the "make" variable can be accessed from within the Car class, from any subclass of Car ( such as ElectricCar), and from any class in the same package as Car. However, it cannot be accessed from classes in different packages that are not subclasses of Car. This allows us to control access to the "make" variable while still allowing it to be inherited and used by subclasses and classes within the same package.

}
