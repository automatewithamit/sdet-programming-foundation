package com.sdet.foundation.assignments;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int count=0;
        for(int start=1;start<=10;start++){
            if(start%2==0){
                count=count+1;

            }

        }
        System.out.println(count);
    }
}
