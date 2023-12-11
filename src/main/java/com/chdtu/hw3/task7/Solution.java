package com.chdtu.hw3.task7;
import java.util.Scanner;
public class Solution {
    private static final String TRIANGLE_EXISTS = "трикутник існує";
    private static final String TRIANGLE_NOT_EXISTS = "трикутник не існує";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжину першої сторони:");
        double side1 = scanner.nextDouble();

        System.out.println("Введіть довжину другої сторони:");
        double side2 = scanner.nextDouble();

        System.out.println("Введіть довжину третьої сторони:");
        double side3 = scanner.nextDouble();

        if (isTriangleExists(side1, side2, side3)) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }

    private static boolean isTriangleExists(double side1, double side2, double side3) {
        return (side1 < side2 + side3) && (side2 < side1 + side3) && (side3 < side1 + side2);
    }
}

