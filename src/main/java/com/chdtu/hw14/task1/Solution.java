package com.chdtu.hw14.task1;

import java.util.HashMap;

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Іван Іванов", 85.5);
        grades.put("Марія Петренко", 92.0);
        grades.put("Олег Сидоров", 78.3);
        grades.put("Анна Коваленко", 89.7);
        grades.put("Петро Лисенко", 95.2);
    }
}


