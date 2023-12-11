package com.chdtu.hw6.task5;

public class Solution {
    public static int[][] array;

    public static void main(String[] args) {
        array = new int[][]{{1, 2, 3}, {4, 5, 6}};

        // Виведення  масиву
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
