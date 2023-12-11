package com.chdtu.hw6.task3;

import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Виведення надпису
        System.out.println("Введіть кількість рядків масиву (N): ");
        int n = scanner.nextInt();

        // Перевірка
        if (n <= 0) {
            System.out.println("Кількість рядків має бути більшою за 0.");
            return;
        }

        // Виведення надпису
        System.out.println("Введіть " + n + " чисел для розмірів рядків масиву:");
        int[] rowSizes = new int[n];
        for (int i = 0; i < n; i++) {
            rowSizes[i] = scanner.nextInt();
        }

        // Заповнення двовимірного масиву
        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            multiArray[i] = new int[rowSizes[i]];
        }

        // Виведення масиву
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < rowSizes[i]; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
