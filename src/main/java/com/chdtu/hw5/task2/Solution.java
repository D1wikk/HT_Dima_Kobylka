package com.chdtu.hw5.task2;

public class Solution {
    public static final String ODD = "Непарний";
    public static final String EVEN = "Парний";
    public static String[] strings = new String[5];
    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                strings[i] = EVEN;
            } else {
                strings[i] = ODD;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print("index = " + i);
            System.out.println(" value = " + strings[i]);
        }
    }
}
