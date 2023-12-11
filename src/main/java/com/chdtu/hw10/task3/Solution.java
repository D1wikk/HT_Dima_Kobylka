package com.chdtu.hw10.task3;

public class Skyscraper {
    private int floorsCount;
    private String developer;

    // Конструктор без параметрів
    public Skyscraper() {
        this.floorsCount = 5;
        this.developer = "Development";
    }

    // Конструктор з параметрами
    public Skyscraper(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Невідомо");
    }
}

