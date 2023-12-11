package com.chdtu.hw10.task6;

class Car {
    public Car(String carType) {
        System.out.println("Привіт. Я " + carType);
    }
}

class ElectricCar extends Car {
    public ElectricCar() {
        super("ElectricCar");
    }
}

class GasCar extends Car {
    public GasCar() {
        super("GasCar");
    }
}

class HybridCar extends Car {
    public HybridCar() {
        super("HybridCar");
    }
}

public class Solution {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();
        HybridCar hybridCar = new HybridCar();
    }
}


