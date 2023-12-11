package com.chdtu.hw12.task6;

public class Solution {
    public static void main(String[] args) {
        String string = "Гадаю, це буде нова фіча. Тільки нікому не кажіть, що вона виникла випадково.";
        System.out.println("Кількість цифр у рядку : " + countDigits(string));
        System.out.println("Кількість літер у рядку : " + countLetters(string));
        System.out.println("Кількість пробілів у рядку : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int digitCount = 0;
        for (char ch : string.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        return digitCount;
    }

    public static int countLetters(String string) {
        int letterCount = 0;
        for (char ch : string.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            }
        }
        return letterCount;
    }

    public static int countSpaces(String string) {
        int spaceCount = 0;
        for (char ch : string.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                spaceCount++;
            }
        }
        return spaceCount;
    }
}

