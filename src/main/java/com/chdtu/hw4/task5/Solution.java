package com.chdtu.hw4.task5;

public class Solution {
    public static void main(String[] args) {
        int height = 10;
        int width = 20;

        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < width) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

