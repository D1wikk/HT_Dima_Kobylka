package com.chdtu.hw9.task15;

public class Entity {
    public void move() {
        System.out.println("Я рухаюся.");
    }

    public void eat() {
        System.out.println("Я їм.");
    }
}

public class Human extends Entity {
    // Методи вже успадковані від Entity
}

public class JavaDeveloper extends Human {
    // Методи вже успадковані від Human
    // Тут можна додати додаткові методи або властивості для JavaDeveloper
}

