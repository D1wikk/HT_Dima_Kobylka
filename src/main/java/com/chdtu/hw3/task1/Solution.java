package com.chdtu.hw3.task1;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String cold = "на вулиці холодно";
        String warm = "на вулиці тепло";

        // Зчитуємо температуру з клавіатури
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть температуру на вулиці: ");
        int temperature = scanner.nextInt();

        // Перевіряємо температуру та виводимо результат
        if (temperature < 0) {
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }
    }
}

