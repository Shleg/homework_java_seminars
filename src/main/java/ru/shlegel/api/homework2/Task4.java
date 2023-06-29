package ru.shlegel.api.homework2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        task4();
    }
    public static void task4() {
        System.out.println("\nЗадача 4: Калькулятор с логированием\n");

        StringBuilder res = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        res.append(num1);

        System.out.print("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        res.append(" " + operator + " ");

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
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
                return;
        }

        res.append(" = " + result);
        try (FileWriter fileWriter = new FileWriter("task4_log.txt", true)){
            fileWriter.write(LocalDateTime.now() + ": " + res);
            fileWriter.write(System.lineSeparator());
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Результат: " + res);
        System.out.println("----------------------------------" );
    }
}
