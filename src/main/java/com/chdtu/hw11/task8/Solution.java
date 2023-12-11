package com.chdtu.hw11.task8;

public class Solution {
    public static void main(String[] args) {
        int a = 45;
        int b = 15;

        Calculator.add(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }

    static class Calculator {
        public static final String EQUAL = " = ";

        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            if (b != 0) {
                System.out.println(a + " / " + b + EQUAL + (a / b));
            } else {
                System.out.println("Division by zero is undefined");
            }
        }
    }
}


