package com.chdtu.hw10.task4;

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    // Конструктор із трьома параметрами
    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Конструктор із двома параметрами
    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Помаранчевий";
    }

    // Конструктор з одним параметром
    public CarConcern(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Помаранчевий";
    }
}
