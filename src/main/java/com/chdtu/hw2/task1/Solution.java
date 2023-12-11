package com.chdtu.hw2.task1;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int num1 = scanner.nextInt();
        System.out.println("Введіть друге число:");
        int num2 = scanner.nextInt();
        System.out.println("Введіть третє число:");
        int num3 = scanner.nextInt();
        double average = (double) (num1 + num2 + num3) / 3;
        System.out.println("Середнє арифметичне: " + average);
    }
}
