package com.chdtu.hw9.task4;

public class Solution {
    public static void main(String[] args) {
        div(0.0, 5.0); // Виведе "Infinity"
        div(0.0, -7.0); // Виведе "-Infinity"
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}

