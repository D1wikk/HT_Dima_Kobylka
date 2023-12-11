package com.chdtu.hw10.task12;

import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int insertIndex = 0;

        for (String element : array) {
            if (element != null) {
                array[insertIndex++] = element;
            }
        }

        // Заповнюємо залишок масиву null
        while (insertIndex < array.length) {
            array[insertIndex++] = null;
        }
    }
}

