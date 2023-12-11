package com.chdtu.hw10.task19;

// Keyboard.java
public class Keyboard {
    // Додайте логіку класу Keyboard, якщо потрібно
}

// Monitor.java
public class Monitor {
    // Додайте логіку класу Monitor, якщо потрібно
}

// Mouse.java
public class Mouse {
    // Додайте логіку класу Mouse, якщо потрібно
}

// SystemUnit.java
public class SystemUnit {
    // Додайте логіку класу SystemUnit, якщо потрібно
}

// Computer.java
public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;
    private SystemUnit systemUnit;

    public Computer() {
        this.keyboard = new Keyboard();
        this.monitor = new Monitor();
        this.mouse = new Mouse();
        this.systemUnit = new SystemUnit();
    }

    // Додайте інші методи або логіку класу Computer, якщо потрібно
}

