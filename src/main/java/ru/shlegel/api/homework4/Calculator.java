package ru.shlegel.api.homework4;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        task3();
    }
    public static void task3() {
        System.out.println("\nЗадача 3: Калькулятор с логированием и историей операций\n");

        double num1;
        double num2;

        LinkedList<Double> linkedList = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            res.setLength(0);
            if (linkedList.isEmpty()) {
                System.out.print("Введите первое число: ");
                num1 = scanner.nextDouble();
                res.append(num1);
            } else {
                num1 = linkedList.getLast();
                System.out.println("Первое число = " + num1);
                res.append(num1);
            }


            System.out.print("Выберите операцию (+, -, *, /) или ! для отмены последней операции (q - для выхода): ");
            char operator = scanner.next().charAt(0);
            res.append(" " + operator + " ");

            if (operator == '!') {
                linkedList.removeLast();
                res.append("Отмена операции");
            } else if ((operator == 'q')) {
                return;
            } else {
                System.out.print("Введите второе число: ");
                num2 = scanner.nextDouble();
                res.append(num2);

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
                        continue;
                }
            res.append(" = " + result);
            linkedList.add(result);
            }
            writeLog(res);
            System.out.println("Результат: " + res);
            System.out.println("----------------------------------" );
        }
    }

    public static void writeLog(StringBuilder text) {
        try (FileWriter fileWriter = new FileWriter("task4_log.txt", true)){
            fileWriter.write(LocalDateTime.now() + ": " + text);
            fileWriter.write(System.lineSeparator());
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
