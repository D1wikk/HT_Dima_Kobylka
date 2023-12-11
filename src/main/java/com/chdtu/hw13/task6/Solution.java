package com.chdtu.hw13.task6;

import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");
        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);
        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);
        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().contains("bug")) {
                list.remove(i);
                i--;  // зменшуємо лічильник, оскільки елементи зміщуються вліво
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.toLowerCase().contains("bug")) {
                iterator.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> copy = new ArrayList<>(list);
        for (String word : copy) {
            if (word.toLowerCase().contains("bug")) {
                list.remove(word);
            }
        }
    }
}
