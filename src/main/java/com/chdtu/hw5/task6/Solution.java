package com.chdtu.hw5.task6;
import java.util.Scanner;
public class Solution {
    public static int[] array;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < N; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}

