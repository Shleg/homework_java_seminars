package ru.shlegel.api.homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("Домашняя работа №3\n----------------------------------" );

        ArrayList<Integer> myArrayList = MyArrayList.getRandomArray();

        while(flag){
            System.out.println("\n1 - удалить все четные числа");
            System.out.println("2 - найти минимальное значение");
            System.out.println("3 - найти максимальное значение");
            System.out.println("4 - найти среднее значение");
            System.out.println("0 - Завершение работы приложения");
            System.out.print("Введите номер: ");
            int task_num = scanner.nextInt();

            switch (task_num) {
                case 1 -> RemoveEven.removeEven(myArrayList);
                case 2 -> MinArrayElement.getMinArrayElem(myArrayList);
                case 3 -> MaxArrayElement.getMaxArrayElem(myArrayList);
                case 4 -> AvarageValue.getAverageValue(myArrayList);
                case 0 -> {
                    System.out.println("Завершение работы приложения.");
                    flag = false;
                }
                default -> System.out.println("Некорректный номер задачи,повторите попытку ввода.\n");
            }
        }
    }
}
