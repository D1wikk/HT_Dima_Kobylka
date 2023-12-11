package com.chdtu.hw12.task4;

public class Solution {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";
        System.out.println("Поточний баланс: " + balance);
        processPayment(bill);
        System.out.println("Поточний баланс: " + balance);
    }

    public static void processPayment(String bill) {
        // Перетворюємо чек у формат Integer та віднімаємо від балансу
        int paymentAmount = Integer.parseInt(bill);
        balance -= paymentAmount;
    }
}


