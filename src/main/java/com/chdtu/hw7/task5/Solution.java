package com.chdtu.hw7.task5;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Обмін значень елементів з обох кінців масиву
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Збільшення початкового і зменшення кінцевого покажчика
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

