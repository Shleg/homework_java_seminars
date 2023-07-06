package ru.shlegel.api.homework4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        System.out.println("Домашняя работа №3\n----------------------------------" );


        try (Scanner scanner = new Scanner(System.in)){
            boolean flag = true;
            while(flag){
                System.out.println("\n1 - перевернуть LinkedList");
                System.out.println("2 - калькулятор");
                System.out.println("0 - Завершение работы приложения");
                System.out.print("Введите номер: ");
                int task_num = scanner.nextInt();

                switch (task_num) {
                    case 1 -> LinkedListExample.task1();
                    case 2 -> Calculator.task3();
                    case 0 -> {
                        System.out.println("Завершение работы приложения.");
                        flag = false;
                    }
                    default -> System.out.println("Некорректный номер задачи,повторите попытку ввода.\n");
                }
            }
        }
    }
}
