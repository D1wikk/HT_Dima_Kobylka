package com.chdtu.hw7.task9;

public class Solution {
    public static void main(String[] args) {
        // Приклад виклику методу ninthDegree()
        long result = ninthDegree(2);
        System.out.println(result); // Виведе 512
    }

    public static long cube(long a) {
        return a * a * a;
    }

    // Реалізація методу для піднесення числа до дев'ятого степеня
    public static long ninthDegree(long number) {
        long cubeResult = cube(number);
        return cube(cubeResult);
    }
}

