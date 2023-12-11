package com.chdtu.hw11.task2;

public class Solution {
    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}

class Planet {
    String name;
    long age;
    int speed;
    int area;

    void printInformation() {
        System.out.println("Планета: " + name);
        System.out.println("Вік: " + age + " років");
        System.out.println("Швидкість: " + speed + " км/год");
        System.out.println("Площа: " + area + " км²");
    }
}

