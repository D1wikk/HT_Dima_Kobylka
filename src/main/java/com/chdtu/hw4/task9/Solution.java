package com.chdtu.hw4.task9;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number < minNumber) {
                    minNumber = number;
                }
            } else {
                break;
            }
        }

        if (minNumber == Integer.MAX_VALUE) {
            System.out.println("Максимальне значення числа типу int");
        } else {
            System.out.println(minNumber);
        }
    }
}

