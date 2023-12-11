package com.chdtu.hw7.task13;

public class  Solution {
    public static String city = "Токіо";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Делі", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);
    }

    public static void printCityPopulation(String cityName, double cityPopulation) {
        System.out.println("Населення міста " + cityName + " становить " + cityPopulation + " млн осіб.");
        System.out.println("А тимчасом у найбільш населеному місті " + city + " мешкає " + population + " млн осіб.");
    }
}

