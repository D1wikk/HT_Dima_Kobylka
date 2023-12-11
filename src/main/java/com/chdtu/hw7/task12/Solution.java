package com.chdtu.hw7.task12;

public class Solution {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String messagePrefix = "Квадратний корінь із числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(messagePrefix + element + " дорівнює " + elementSqrt);
        }
    }
}

