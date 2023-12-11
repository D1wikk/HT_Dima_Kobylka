package com.chdtu.hw3.task9;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String result;
        if (number < 5) {
            result = "число менше за 5";
        } else if (number > 5) {
            result = "число більше за 5";
        } else {
            result = "число дорівнює 5";
        }

        System.out.println(result);
    }
}

