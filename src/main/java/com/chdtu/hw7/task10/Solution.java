package com.chdtu.hw7.task10;

public class Solution {
    public static void main(String[] args) {
        Person person = new Person("Петро", "Петренко");
        System.out.println("Досьє.");
        System.out.println("Ім'я: " + person.getFirstName());
        System.out.println("Прізвище: " + person.getLastName());
        System.out.println("Повне ім'я: " + person.getFullName());
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

