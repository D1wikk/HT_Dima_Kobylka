package com.chdtu.hw13.task2;

import java.util.HashSet;

public class Solution {
    public static HashSet<String> words = new HashSet<>(java.util.Arrays.asList("Якби мене попросили вибрати мову взамін на Java, я б не вибирав".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println("Слово " + word + " є в множині");
        } else {
            System.out.println("Слова " + word + " немає в множині");
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}

