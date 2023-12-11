package com.chdtu.hw11.task5;

class Window {
    int width = 2;
    int height = 3;

    void changeSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void printSize() {
        System.out.println("Розміри вікна: " + width + " x " + height);
    }
}

public class Solution {
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}


