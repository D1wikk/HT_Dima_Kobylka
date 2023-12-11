package com.chdtu.hw4.task3;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Введіть цілі числа. Для завершення введіть слово ENTER.");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Сума введених чисел: " + sum);
    }
}

