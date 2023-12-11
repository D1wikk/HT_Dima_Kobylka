package com.chdtu.hw5.task7;
import java.util.Arrays;
import java.util.Scanner;
public class Solution {
    public static String[] strings;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[j] != null && strings[i].equals(strings[j])) {
                        strings[j] = null;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}


