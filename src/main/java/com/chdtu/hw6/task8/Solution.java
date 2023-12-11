package com.chdtu.hw6.task8;

import java.util.Scanner;

public class Solution {
    public static String[][] array = new String[][]{
            {"123", "Іванов", "Богдан"},
            {"1425", "Петрова", "Марина"},
            {"37", "Богдан", "Андрій"},
            {"98", "Богданова", "Марина"},
            {"6285", "Прутко", "Сергій"},
            {"8", "Клочкова", "Олена"},
            {"754", "Котов", "Іван"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть рядок для пошуку:");


        String searchString = scanner.nextLine().trim().toLowerCase();

        // Пошук та виведення результату
        for (String[] student : array) {
            for (String field : student) {
                if (field.toLowerCase().contains(searchString)) {
                    System.out.println(student[0] + " " + student[1] + " " + student[2]);

                }
            }
        }
    }
}
