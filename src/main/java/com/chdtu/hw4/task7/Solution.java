package com.chdtu.hw4.task7;public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        while (number <= 100) {
            if (number % 3 == 0) {
                number++;
                continue;
            }

            sum += number;
            number++;
        }

        System.out.println("Сума чисел від 1 до 100 (не кратних 3): " + sum);
    }
}

