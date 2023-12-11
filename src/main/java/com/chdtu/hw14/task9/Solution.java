package com.chdtu.hw14.task9;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static Integer min(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    public static Integer max(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        return Collections.frequency(list, element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        return Collections.binarySearch(list, key);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5, 2, 8, 1, 3);

        // Testing min
        System.out.println("Minimum value: " + min(list));

        // Testing max
        System.out.println("Maximum value: " + max(list));

        // Testing frequency
        System.out.println("Frequency of 2: " + frequency(list, 2));

        // Testing binarySearch
        Collections.sort(list);
        System.out.println("Binary search for 3: " + binarySearch(list, 3));
    }
}

