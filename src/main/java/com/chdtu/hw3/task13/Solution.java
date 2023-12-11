package com.chdtu.hw3.task13;
import java.util.Scanner;
public class Solution {
    public static String secret = "AmIGo";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок:");
        String input = scanner.nextLine();
        // Порівняння рядків без урахування регістру
        if (secret.equalsIgnoreCase(input)) {
            System.out.println("доступ дозволено");
        } else {
            System.out.println("доступ заборонено");
        }
    }
}
