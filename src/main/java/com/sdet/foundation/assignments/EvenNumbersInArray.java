package com.sdet.foundation.assignments;

public class EvenNumbersInArray {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,9};
        int count=0;
        for(int even : numbers){
            if(even%2==0){
                 count=count+1;
            }
        }
        System.out.println("Count Of Even Numbers in array is " + count);
    }
}
