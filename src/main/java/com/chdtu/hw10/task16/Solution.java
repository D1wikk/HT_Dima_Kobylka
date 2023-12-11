package com.chdtu.hw10.task16;

public class Solution {
    public static void showWeather(City city) {
        System.out.println("У місті " + city.getCityName() + " сьогодні температура повітря " + city.getTemperature());
    }

    public static void main(String[] args) {
        City dubai = new City("Дубай", 40);
        showWeather(dubai);
    }
}


