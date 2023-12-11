package com.chdtu.hw12.task8;

public class Solution {
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'б');
        compare('р', 'в');
        compare('и', 'и');
    }

    public static void compare(Character first, Character second) {
        int result = first.compareTo(second);

        if (result == 0) {
            System.out.println("однакові");
        } else if (result > 0) {
            System.out.println("більше");
        } else {
            System.out.println("менше");
        }
    }
}


