package com.chdtu.hw11.task7;

public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    private class Engine {
        private boolean isRunning;

        public void start() {
            isRunning = true;
            System.out.println("Двигун запущено");
        }

        public void stop() {
            isRunning = false;
            System.out.println("Двигун зупинено");
        }
    }
}

