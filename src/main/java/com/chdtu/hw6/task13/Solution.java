package com.chdtu.hw6.task13;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static String[][] expectedArray = new String[3][3];
    public static String[][] actualArray = new String[3][3];

    static {

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть символи для actualArray (по одному символу, порожня клітина - пробіл, зафарбована - #):");

        for (int i = 0; i < actualArray.length; i++) {
            for (int j = 0; j < actualArray[0].length; j++) {
                actualArray[i][j] = scanner.next();
            }
        }

        boolean arraysEqual = Arrays.deepEquals(actualArray, expectedArray);

        System.out.println("Результат порівняння масивів: " + arraysEqual);
    }
}

