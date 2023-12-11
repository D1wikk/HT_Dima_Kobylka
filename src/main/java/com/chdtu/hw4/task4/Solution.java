package com.chdtu.hw4.task4;

public class Solution {
    public static void main(String[] args) {
        int height = 5;
        int width = 10;

        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < width) {
                System.out.print("Q");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

