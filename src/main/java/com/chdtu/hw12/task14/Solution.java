package com.chdtu.hw12.task14;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        // Видаляємо мову програмування Pascal
        programmingLanguages.remove("Pascal");

        // Друкуємо оновлений список
        System.out.println(programmingLanguages);
    }
}


