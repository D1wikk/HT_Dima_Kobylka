package com.chdtu.hw2.task6;

public class Solution {
    public static int result = 40; // Ініціалізація значення result
    public static void main(String[] args) {
        String loop = " for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {\n";
        System.out.println(loop);
        // Виконання коду та присвоєння значення result
        result = Integer.parseInt(loop.replaceAll("\\W", "").split("fahrenheit")[1]);
    }
}
