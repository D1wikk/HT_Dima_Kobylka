package com.chdtu.hw4.task6;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введіть дані (або введіть 'enough' для завершення):");
            String input = scanner.nextLine();

            if (input.equals("enough")) {
                System.out.println("Введено 'enough'. Завершення програми.");
                break;
            }

            System.out.println("Введені дані: " + input);
        }
    }
}

