package com.chdtu.hw11.task1;

public class Solution {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();

        System.out.println("Людство живе в Сонячній системі.");
        System.out.println("Її вік близько " + solarSystem.age + " років.");
        System.out.println("У Сонячній системі " + solarSystem.planetCount + " відомих планет.");
        System.out.println("Так само, як і більшість зоряних систем, вона має " + solarSystem.starCount + " зорю.");
        System.out.println("Зорю на ім'я " + solarSystem.starName + ".");
        System.out.println("Відстань до центра галактики становить " + solarSystem.distanceToGalaxyCenter + " світлових років.");
        System.out.println("Кожен мешканець Сонячної системи має знати цю інформацію!");
    }
}

class SolarSystem {
    long age = 4568200000L;
    int planetCount = 8;
    int starCount = 1;
    String starName = "Сонце";
    int distanceToGalaxyCenter = 27170;
}

