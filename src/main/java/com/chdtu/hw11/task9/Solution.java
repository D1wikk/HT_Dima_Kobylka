package com.chdtu.hw11.task9;

public class Solution {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner innerObject = outer.new Inner();
        Outer.Nested nestedObject = new Outer.Nested();

        // Ваш код для роботи з об'єктами innerObject та nestedObject
        System.out.println("Робота з об'єктом Inner");
        // Додайте свою логіку для об'єкта Inner

        System.out.println("Робота з об'єктом Nested");
        // Додайте свою логіку для об'єкта Nested
    }
}

