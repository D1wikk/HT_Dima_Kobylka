package com.chdtu.hw6.task14;

import java.util.Arrays;

public class Solution {
    public static char[][] array = new char[5][6];

    public static void main(String[] args) {
        // Заповнення першого та останнього рядка x
        Arrays.fill(array[0], 'X');
        Arrays.fill(array[4], 'X');

        // Заповнення другого та третього рядка пробілами та X
        Arrays.fill(array[1], 'X');
        Arrays.fill(array[2], ' ');
        Arrays.fill(array[3], 'X');

        printArray();
    }

    private static void printArray() {
        for (char[] row : array) {
            for (char symbol : row) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}

