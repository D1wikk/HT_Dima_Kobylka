package com.chdtu.hw14.task8;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
    }

    public static void main(String[] args) {
        ArrayList<String> destination = new ArrayList<>();
        ArrayList<String> source = new ArrayList<>();
        Collections.addAll(source, "one", "two", "three");

        // Testing copy
        copy(destination, source);
        System.out.println("Copied List: " + destination);

        // Testing addAll
        addAll(destination, "four", "five");
        System.out.println("List after addAll: " + destination);

        // Testing replaceAll
        replaceAll(destination, "two", "2");
        System.out.println("List after replaceAll: " + destination);
    }
}

