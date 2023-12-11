package com.chdtu.hw4.task14;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть рядок:");
        String inputString = scanner.nextLine();

        System.out.println("Введіть число (більше за 0 і менше за 5):");
        int number = scanner.nextInt();

        if (number > 0 && number < 5) {
            int count = 0;
            do {
                System.out.println(inputString);
                count++;
            } while (count < number);
        } else {
            System.out.println(inputString);
        }
    }
}

