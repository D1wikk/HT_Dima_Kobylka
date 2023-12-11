package com.chdtu.hw12.task15;

import java.util.ArrayList;

public class Solution {
    private static ArrayList<String> initList() {
        // ... код ініціалізації списку ...
    }

    public static void print(ArrayList<String> glasses) {
        for (int i = glasses.size() - 1; i >= 0; i--) {
            System.out.println(glasses.get(i));
        }
    }

    public static void removeGlassesReverse(ArrayList<String> glasses) {
        System.out.println("Починаємо розбирати піраміду...");

        // Починаємо видаляти елементи з кінця списку
        for (int i = glasses.size() - 1; i >= 0; i--) {
            glasses.remove(i);
        }

        System.out.println("Піраміду розібрано!");
    }

    public static void main(String[] args) {
        ArrayList<String> glasses = initList();
        print(glasses);
        removeGlassesReverse(glasses);
        print(glasses);
    }
}
