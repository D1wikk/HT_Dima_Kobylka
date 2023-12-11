package com.chdtu.hw2.task3;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть радіус круга:");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        int roundedArea = (int) Math.floor(area);
        System.out.println(roundedArea);
    }
}
