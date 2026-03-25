package com.sdet.foundation.assignments;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] numbers =  {10,30,40,50};
        int sum=0;
        for(int elements : numbers){
            sum=sum+elements;
        }
        System.out.println(sum);

    }
}
