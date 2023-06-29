package ru.shlegel.api.homework2;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("Домашняя работа №2");

        while (flag) {
            System.out.println("\n----------------------------------\n1 - Задача 1");
            System.out.println("2 - Задача 2");
            System.out.println("3 - Задача 3");
            System.out.println("4 - Задача 4");
            System.out.println("0 - Завершение работы приложения");
            System.out.print("Введите номер: ");
            int task_num = scanner.nextInt();

            switch (task_num) {
                case 1 -> Task1.task1();
                case 2 -> Task2.task2();
                case 3 -> Task3.task3();
                case 4 -> Task4.task4();
                case 0 -> {
                    System.out.println("Завершение работы приложения.");
                    flag = false;
                }
                default -> System.out.println("Некорректный номер задачи,повторите попытку ввода.\n");
            }
        }
    }
}

