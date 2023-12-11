package com.chdtu.hw10.task5;

public class Building {
    private String type;

    // Видаляємо конструктор

    // Метод initialize для зміни типу будівлі
    public void initialize(String buildingType) {
        this.type = buildingType;
    }

    public static void main(String[] args) {
        Building building = new Building(); // Будівля тепер без конструктора
        building.initialize("Барбершоп");
    }
}
