package com.chdtu.hw7.task8;

public class Solution {
    public static void main(String[] args) {
        // Приклад виклику методу cube()
        long result = cube(5);
        System.out.println(result); // Виведе 125
    }

    // Реалізація методу для піднесення числа до третього степеня
    public static long cube(long number) {
        return number * number * number;
    }
}


