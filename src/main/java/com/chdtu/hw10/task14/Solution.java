package com.chdtu.hw10.task14;

public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {  // Використовуємо аргумент методу, а не статичне поле
        System.out.println("Куплено 10 батонів");
        } else {
        System.out.println("Куплено 1 батон");
        }
}


