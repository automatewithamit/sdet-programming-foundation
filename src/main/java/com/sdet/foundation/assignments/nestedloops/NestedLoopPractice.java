package com.sdet.foundation.assignments.nestedloops;

public class NestedLoopPractice {
    public static void main(String[] args) {
        int k=1;
     for(int row=1;row<=5;row++){
         for(int col=1;col<=row;col++){
             System.out.print(k +  " ");
             k=k+1;
         }
         System.out.println();
     }
    }
}
