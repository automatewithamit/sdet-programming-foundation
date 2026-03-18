package com.sdet.foundation.week1.keywords;

public class BreakKeyword {

    //Break is used to stop the execution of the loops/switch statements

    public static void main(String[] args) {

        //Program to Print from 1 to 50 and stop printing number when a number divisible by 11

        for (int i = 1; i <=50; i++) {

            if (i%11==0)
                break;// Break Keyword here pulls execution out of the loop
            System.out.println(i);
        }


    }
}
