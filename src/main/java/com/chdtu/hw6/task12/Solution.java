package com.chdtu.hw6.task12;

import java.util.Scanner;

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введіть розмірність шахової дошки:");
        int size = scanner.nextInt();


        initializeChessboard(size);

        // Виведення масиву на екран
        printArray();
    }

    private static void initializeChessboard(int size) {
        array = new char[size][size];

        // Заповнення масиву шахової дошки
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Чорні клітини позначаємо як '#', білі - ' '
                array[i][j] = (i + j) % 2 == 0 ? '#' : ' ';
            }
        }
    }

    private static void printArray() {
        // Виведення масиву на екран
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


