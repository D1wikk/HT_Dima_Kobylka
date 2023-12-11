package com.chdtu.hw14.task5;

import java.util.Map;
import java.util.TreeMap;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(0, "Newbie");
        map.put(200, "Trainee");
        map.put(800, "Junior");
        map.put(1200, "Strong Junior");
        map.put(2700, "Middle");
        map.put(3500, "Strong Middle");
        map.put(5000, "Senior");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int salary = random.nextInt(50) * 100;
            String position = getJobTitle(map, salary);
            System.out.printf("Зарплатні $%d відповідає позиція %s%n", salary, position);
        }
    }

    public static String getJobTitle(TreeMap<Integer, String> map, Integer salary) {
        Map.Entry<Integer, String> entry = map.floorEntry(salary);
        if (entry != null) {
            return entry.getValue();
        } else {
            return "Немає відповідної посади";
        }
    }
}

