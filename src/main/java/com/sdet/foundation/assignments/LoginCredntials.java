package com.sdet.foundation.assignments;

import java.util.Scanner;

public class LoginCredntials {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Username");
        String username=scanner.next();
        System.out.println("Enter Password");
        String password=scanner.next();
        String actualUsername="admin";
        String actualPassword="12345";
                if(username.equals(actualUsername) && password.equals(actualPassword)){
            System.out.println("Login Successful");
        }
                else{
                    System.out.println("Login Invalid");
                }
    }
}
