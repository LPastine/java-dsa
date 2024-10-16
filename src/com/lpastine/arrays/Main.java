package com.lpastine.arrays;

public class Main {
    public static void main(String[] args) {
        /*
            Arrays are not a dynamic data structure. Once you create an array instance,
            you can not change its size
         */
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
