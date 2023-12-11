package com.chdtu.hw4.task8;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxEven = Integer.MIN_VALUE;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number % 2 == 0 && number > maxEven) {
                    maxEven = number;
                }
            } else {
                break;
            }
        }

        if (maxEven == Integer.MIN_VALUE) {
            System.out.println("Мінімальне значення числа типу int");
        } else {
            System.out.println(maxEven);
        }
    }
}

