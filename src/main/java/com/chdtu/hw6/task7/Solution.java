package com.chdtu.hw6.task7;

import java.util.Scanner;

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Заповнення масиву
        int maxElement = Integer.MIN_VALUE;
        System.out.println("Введіть 9 цілих чисел для заповнення масиву:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();


                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }

        System.out.println("Максимальний елемент масиву: " + maxElement);
    }
}

