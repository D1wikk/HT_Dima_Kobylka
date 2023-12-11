package com.chdtu.hw13.task4;

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void print(HashSet<String> words) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(java.util.Arrays.asList("Програмування зазвичай навчають на прикладах.".split(" ")));
        print(words);
    }
}

