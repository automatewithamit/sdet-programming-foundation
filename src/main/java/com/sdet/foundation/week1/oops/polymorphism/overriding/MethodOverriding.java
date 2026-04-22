package com.sdet.foundation.week1.oops.polymorphism.overriding;

public class MethodOverriding {
    //What is Method Overriding?
    //Method overriding is a feature in object-oriented programming that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
    // The method in the subclass must have the same name, return type, and parameters as the method in the superclass.
    // This is a form of runtime polymorphism, where the method to be called is determined at runtime based on the actual object type.


    //Conditions for Method Overriding:
    //1. The method in the child class must have the same name as the method in the parent class.
    //2. The method in the subclass must have the same return type as the method in the superclass.
    //3. The method in the subclass must have the same parameter list as the method in the superclass.
    //4. The method in the subclass must be marked with the @Override annotation (optional but recommended for better readability and to catch errors at compile time).





    //Types of Method Overriding:
    //1. Single Method Overriding: This occurs when a subclass overrides a method from its direct superclass.
    //2. Multilevel Method Overriding: This occurs when a subclass overrides a method from its superclass, and then another subclass overrides the same method from the first subclass.
    //3. Hierarchical Method Overriding: This occurs when multiple subclasses override the same method from a common superclass.




    public void display() {
        System.out.println("This is the parent class method.");
    }

}
