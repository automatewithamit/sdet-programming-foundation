package com.sdet.foundation.week1.methods;

import java.util.Scanner;

public class MethodsExample {
    /**
     1. public -> access modifiers -> it allows any method to be used outside of the Class
     2. static keyword ->
        a. static method can be accessed using Class names
        b. non static methods can be accessed using object of the class
     3. return type -> what type data any particular method is returning
        a. void -> no data is being returned
        b. int -> integer is being returned
        c. String, char, boolean, Class (object) ,
     4. name of the method -> naming of any method should be in camelCasing
     5. parameters/ arguments of any method
        a. type of parameter
        b. name of parameter
        you can use any number of parameters inside any method
     6. body of the method
     7. Calling a method
        a. All the methods called under any static method should also be static or non-static methods are
            not allowed under static methods.
     8. Signature of any Method

        a  type of parameters
        b. number of parameters
        c. order of parameters

     9. Polymorphism ( Object-Oriented Programming Pillar ) of Methods
        Polymorphism -> different forms
            -> Overloading - Method Overloading, Operator Overloading
            -> Overriding - Later in the session when we study OOP
     Method Overloading
        -> By changing signature of any method, it behaves differently and
            this phenomenon is called method overloading


     Benefits

        1. It helps to make code more modular
        2. it helps to reduce duplication of code
        3. It helps to reduce maintenance efforts

     */

//     8. Signature of any Method
//
//    a  type of parameters
//    b. number of parameters
//    c. order of parameters
        //Original method
        public int add(int num1, int num2 ){

            return num1+num2;
        }
        //type of parameters changed
        public int add(int num1, String num2 ){

            return 0;
        }
        //number of parameters
        public int add(int num1, int num2,int num3 ){

            return num1+num2+num3;
        }
        //order of the parameter
        public int add(String num2, int num1 ){

            return 0;
        }
        //




    public static void main(String[] args) {

        boolean isOddNumber = isOdd();
        System.out.println( "Is Odd ? : " + isOddNumber);

    }



    //static methods can be accessed directly using Class Name
    public static  void isEven(){
        int number = takeInputFromUser();
        if(number%2==0){
            System.out.println(number + " is Even");
        }
    }
    public static int takeInputFromUser(){
        System.out.println("Enter a Number :");
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }


    //non static methods can be accessed using Object of the Class
    public static boolean isOdd(){
        int number = takeInputFromUser();
        boolean isOddNumber = true;
        if(number%2==0)
            isOddNumber = false;
        return isOddNumber;
    }


}
