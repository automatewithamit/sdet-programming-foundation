package com.sdet.foundation.week1.arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        //2 D Array
        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
        System.out.println(myNumbers[1][2]);
        for (int row = 0; row < myNumbers.length; row++) {
            for (int col = 0; col < myNumbers[row].length; col++) {
                System.out.print(myNumbers[row][col] + " " );
            }
            System.out.println();
        }
        System.out.println("----------------------------------");
        //3D arrays
        int[][][] multiArray = { {{1,2}, {3,4}, {5,6}}, {{7,8}, {9,10}, {11,12}} };
        for (int row = 0; row < multiArray.length; row++) {
            for (int col = 0; col < multiArray[row].length; col++) {
                for (int i = 0; i < multiArray[row][col].length; i++) {
                    System.out.print(multiArray[row][col][i] + " " );
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
