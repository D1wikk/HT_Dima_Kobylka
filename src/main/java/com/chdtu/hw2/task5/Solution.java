package com.chdtu.hw2.task5;

public class Solution {
    public static int result = -2147483648; // Ініціалізація значення result
    public static void main(String[] args) {
        byte correction = Byte.MAX_VALUE;
        for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
            correction *= fahrenheit;
            System.out.println(correction);
        }

        result = correction; // Присвоєння значення result на основі останньої ітерації циклу
    }
}
