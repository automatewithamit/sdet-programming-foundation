package com.sdet.foundation.week1.loops;

public class LoopsConcepts {
    public static void main(String[] args) {
        //1-100
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);

        //Loops
        //1. for loop
//        int number = '@';
//        System.out.println(number);
        //for(initialization;condition to end the loop ; increment/decrement )
        //{
        // piece of code to be executed under the loop
        //}
        for(int i= 1 ; i<10;i++){ //ASCII character - American Standards Code for Information Interchange
            //
            System.out.println(1);
        }
        int i= 1;

        for( ; i<10;i++){
            //
            System.out.println(1);
        }
//        int j= 1;
//        for( ; j<10;){
//            //
//            System.out.println(j);
//            j++;
//        }

        int number = 1;
        for (;;){
            if(number >10){
                break;
            }
            number = number +1 ;
        }
        /*
        for ( 1 ; 2 ; 3 ){
        4
        }
        Execution Order : 1,2,4,3,2,4,3,2,4,3,2,4


        */
        //2. while
        //3. do while
        //4. foreach





    }
}
