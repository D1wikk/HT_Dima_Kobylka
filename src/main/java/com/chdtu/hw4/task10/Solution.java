package com.chdtu.hw4.task10;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number < firstMin) {
                    secondMin = firstMin;
                    firstMin = number;
                } else if (number < secondMin) {
                    secondMin = number;
                }
            } else {
                break;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("Не введено достатньо чисел");
        } else {
            System.out.println(secondMin);
        }
    }
}

