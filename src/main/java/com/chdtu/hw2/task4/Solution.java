package com.chdtu.hw2.task4;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість банок кока-коли в ящику:");
        int numberOfCans = scanner.nextInt();
        System.out.println("Введіть кількість людей в кабінеті:");
        int numberOfPeople = scanner.nextInt();
        double result = (double) numberOfCans / numberOfPeople;
        System.out.println(result);
    }
}

