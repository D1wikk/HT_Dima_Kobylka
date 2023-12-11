package com.chdtu.hw12.task21;

import java.util.ArrayList;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Faculty {
    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Акакій"));
        students.add(new Student("Любослав"));
        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}

