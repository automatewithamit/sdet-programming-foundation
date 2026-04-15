package com.sdet.foundation.week1.oops.encapsulation.classes;

import com.sdet.foundation.week1.oops.encapsulation.accessmodifiers.AccessModifiers;

public class ChildAccessModifiers extends AccessModifiers {
    //protected  = default access modifier + accessible in child class outside the  package  where it is defined
    public void accessProtectedVariable() {
        // Accessing the protected variable from the parent class
        this.protectedVariable = "Accessing Protected Variable in Child Class";
        System.out.println(this.protectedVariable);
    }
}
