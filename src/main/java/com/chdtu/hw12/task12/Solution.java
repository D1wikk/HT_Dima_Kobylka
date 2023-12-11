package com.chdtu.hw12.task12;

public class CustomStringArrayList {
    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        this.size = 0;
        this.capacity = 10;
        this.elements = new String[capacity];
    }

    public void add(String value) {
        if (size == capacity) {
            grow();
        }

        elements[size++] = value;
    }

    private void grow() {
        int newCapacity = capacity * 3 / 2; // Збільшуємо поточну місткість у півтора рази
        String[] newElements = new String[newCapacity];

        // Копіюємо дані зі старого масиву в новий у тому самому порядку
        System.arraycopy(elements, 0, newElements, 0, size);

        // Оновлюємо поле elements та capacity
        elements = newElements;
        capacity = newCapacity;
    }
}
