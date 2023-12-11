package com.chdtu.hw3.task10;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше число:");
        double number1 = scanner.nextDouble();

        System.out.println("Введіть друге число:");
        double number2 = scanner.nextDouble();

        // Порівняння чисел з точністю до однієї мільйонної
        if (Math.abs(number1 - number2) <= 0.000001) {
            System.out.println("числа рівні");
        } else {
            System.out.println("числа не рівні");
        }
    }
}

