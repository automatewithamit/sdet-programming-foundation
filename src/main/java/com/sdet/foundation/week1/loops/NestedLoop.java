package com.sdet.foundation.week1.loops;

import javax.xml.transform.Source;

public class NestedLoop {
    //Nested Loops are Loops inside Loop

    public static void main(String[] args) {


        /*
         row number - > number of stars
         line break
         int givenRows = 5;
         for ( int rowNum = 1; rowNum <= givenRows ; rowNum++){
              System.out.print( rowNum);
         }

         *
         **
         ***
         ****
         *****
        1
        12
        123
        1234
        12345


        *****
        ****
        ***
        **
        *

        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5

        1
        2 3
        4 5 6
        7 8 9 10

            *
           ***
          *****
         *******
        *********

        * */
        for (int i = 1; i <= 5; i++) { // 3  i =1 | j=1 ,2 , i=2 | j=1 ,2,i= 3 | j=1 ,2
            for (int j = 1; j <=i; j++) { // 2
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("______________________________________");

        /*

         *
         **
         ***
         ****
         *****
        row number - > number of stars
        line break
         */
        int givenRows = 5;

        for (int i = 1; i <= givenRows; i++) { // i = 0,1,2,3,4
            for (int counter = 1; counter <= i; counter++) { // 1 <=0 -> false
                // 1 <=1 -> true
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
