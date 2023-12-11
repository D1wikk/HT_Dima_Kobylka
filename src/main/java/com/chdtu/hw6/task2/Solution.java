package com.chdtu.hw6.task2;

public class Solution {
    public static int[][] result = new int[10][];
    public static void main(String[] args) {


        // Заповнення масиву
        for (int i = 0; i < 10; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                result[i][j] = i + j;
            }
        }

        // Виведення
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
