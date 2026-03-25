package com.sdet.foundation.assignments;

public class OddNumbersInArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40};
        int count=0;
        for(int odd : numbers){
            if(odd % 2 !=0){
                count=count+1;
            }
        }
        System.out.println("Count Of Odd Numbers in array is " + count);
    }
}
