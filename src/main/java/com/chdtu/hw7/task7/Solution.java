package com.chdtu.hw7.task7;

public class Solution {
    public static void main(String[] args) {
        signIn("user");  // Приклад виклику для незареєстрованого користувача
        signIn("John");  // Приклад виклику для зареєстрованого користувача
    }

    public static void signIn(String username) {
        // Перевірка імені користувача
        if ("user".equals(username)) {
            // Якщо ім'я користувача - "user", припиняємо виконання методу
            return;
        }

        // Продовжуємо виконання методу для зареєстрованого користувача
        System.out.println("Ласкаво просимо, " + username);
        System.out.println("Дуже скучили за Вами, " + username);
    }
}

