package com.chdtu.hw3.task11;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перший рядок:");
        String str1 = scanner.nextLine();

        System.out.println("Введіть другий рядок:");
        String str2 = scanner.nextLine();

        // Порівняння рядків
        if (str1.equals(str2)) {
            System.out.println("рядки однакові");
        } else {
            System.out.println("рядки різні");
        }
    }
}

