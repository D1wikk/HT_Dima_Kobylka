package com.chdtu.hw4.task2;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ім'я:");
        String name = scanner.nextLine();
        String text = " любить мене.";
        int count = 0;

        while (count < 10) {
            System.out.println(name + text);
            count++;
        }
    }
}

