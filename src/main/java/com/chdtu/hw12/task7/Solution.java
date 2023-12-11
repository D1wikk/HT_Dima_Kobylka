package com.chdtu.hw12.task7;

public class Solution {
    public static void main(String[] args) {
        int first = 2;
        int second = 1;
        boolean isLess = isLess(first, second);
        if (isLess) {
            System.out.println("Перше число менше за друге");
        } else {
            System.out.println("Перше число більше за друге або дорівнює йому");
        }
    }

    public static boolean isLess(int first, int second) {
        return first < second;
    }
}

