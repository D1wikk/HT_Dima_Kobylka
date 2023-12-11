package com.chdtu.hw15.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static final String PROMPT_STRING = "Введіть номер студента, або exit щоб вийти: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Відповідає ";
    public static final String NOT_EXIST = "Студента з таким номером не існує";

    static List<String> studentsJournal = Arrays.asList(
            "Тимур М'ясний",
            "Пенелопа Сиволап",
            "Орест Злобін",
            "Ірида Продуваленко",
            "Гектор Гадюкін",
            "Електра Чемоданко",
            "Гвідон Недумко",
            "Роксана Борисенко",
            "Юліан Мумбриченко",
            "Зігфрід Горемикін");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();

            if (input.toLowerCase().equals(EXIT)) {
                break;
            }

            try {
                int studentId = Integer.parseInt(input);
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (IndexOutOfBoundsException e) {
                System.out.println(NOT_EXIST);
            } catch (NumberFormatException e) {
                System.out.println("Будь ласка, введіть коректний номер студента.");
            }
        }
    }
}

