package ru.shlegel.api.homework1;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        System.out.println("Домашняя работа №1\n----------------------------------" );

        while(flag){
            System.out.println("\n1 - Задача 1");
            System.out.println("2 - Задача 2");
            System.out.println("3 - Задача 3");
            System.out.println("4 - Задача 4");
            System.out.println("0 - Завершение работы приложения");
            System.out.print("Введите номер: ");
            int task_num = scanner.nextInt();

            switch (task_num) {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4();
                case 0 -> {
                    System.out.println("Завершение работы приложения.");
                    flag = false;
                }
                default -> System.out.println("Некорректный номер задачи,повторите попытку ввода.\n");
            }
        }
    }

    static void task1() {
        System.out.println("\nЗадача 1: Вычисление n-го треугольного числа!\n");

        boolean flagTask1 = true;
        int number = 0;

        while (flagTask1) {
            System.out.print("Введите целое число: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                flagTask1 = false;
            } else {
                System.out.println("Ошибка! Введено не целое число. Повторите ввод.");
                scanner.next();
            }
        }

        double tNumber = 0.5 * number * (number + 1);
        System.out.printf("%d-ое треугольное число равно %.0f\n", number, tNumber);
        System.out.println("----------------------------------" );
    }

    static void task2() {
        System.out.println("\nЗадача 2: Простые числа от 1 до N\n");

        boolean flagTask2 = true;
        int number = 0;

        while (flagTask2) {
            System.out.print("Введите целое число: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                flagTask2 = false;
            } else {
                System.out.println("Ошибка! Введено не целое число. Повторите ввод.");
                scanner.next();
            }
        }

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n----------------------------------" );
    }


    static void task3(){
        System.out.println("\nЗадача 3: Простой калькулятор\n");

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка! Неверная операция.");
                return;
        }
        System.out.println("Результат: " + result);
        System.out.println("----------------------------------" );
    }

    static void task4(){
        System.out.println("\nЗадача 4: Проверка равенства\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уравнение вида '2? + ?5 = 69': ");
        String equation = scanner.nextLine();

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                String result = equation;
                result = result.replaceFirst("\\?", String.valueOf(i));
                result = result.replace("?", String.valueOf(j));
                String[] parts = result.split("\\s*[+=]\\s*");
                String numQ = parts[0];
                String numW = parts[1];
                String numE = parts[2];
                if (Integer.parseInt(numQ) + Integer.parseInt(numW) == Integer.parseInt(numE)) {
                    System.out.printf("Решение найдено: %s + %s = %s", numQ, numW, numE);
                    System.out.println("\n----------------------------------" );
                    return;
                }
            }
        }

        System.out.println("Решение не найдено");
        System.out.println("----------------------------------" );
    }
}
