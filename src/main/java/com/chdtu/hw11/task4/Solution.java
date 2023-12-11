package com.chdtu.hw11.task4;

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";

        // Перетворення рядка на тип double за допомогою parseDouble
        double parsedDouble = Double.parseDouble(string);

        // Округлення отриманого значення за допомогою round
        long roundedValue = Math.round(parsedDouble);

        // Виведення результату на екран
        System.out.println(roundedValue);
    }
}

