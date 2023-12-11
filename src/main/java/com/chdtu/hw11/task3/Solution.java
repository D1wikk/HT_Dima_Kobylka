package com.chdtu.hw11.task3;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Презентація роботів, виготовлених компанією " + Robot.vendor);
        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.displayInformation();
        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot2.displayInformation();
        Robot robot3 = new Robot("BugDestroyer-007", 1998);
        robot3.displayInformation();
        Robot robot4 = new Robot("Gundam-14", 2004);
        robot4.displayInformation();
        Robot robot5 = new Robot("Eve-2", 2012);
        robot5.displayInformation();
    }
}

class Robot {
    String model;
    int year;
    static String vendor = "XYZ Corporation";

    Robot(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayInformation() {
        System.out.println("Модель: " + model);
        System.out.println("Рік випуску: " + year);
        System.out.println("Виробник: " + vendor);
        System.out.println();
    }
}


