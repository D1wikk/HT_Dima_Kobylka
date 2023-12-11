package com.chdtu.hw2.task2;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть третій рядок:");
        String thirdLine = scanner.nextLine();
        System.out.println("Введіть другий рядок:");
        String secondLine = scanner.nextLine();
        System.out.println("Введіть перший рядок:");
        String firstLine = scanner.nextLine();
        System.out.println(thirdLine);
        System.out.println(secondLine.toUpperCase());
        System.out.println(firstLine.toLowerCase());
    }
}

