package com.chdtu.hw6.task1;

public class Solution {
    public static int[][] MULTIPLICATION_TABLE;
    public static void main(String[] args) {
        int[][] MULTIPLICATION_TABLE = new int[10][10];

        // Заповнення масиву
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
            }
        }

        // Виведення
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }

    }
}
