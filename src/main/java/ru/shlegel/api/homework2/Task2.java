package ru.shlegel.api.homework2;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        task2();
    }

    public static void task2() {
        System.out.println("\nЗадача 2: Сортировка\n");
        int[] array = {5, 3, 14, 8, 91, 22, 45, 9};
        int totalIter = 0;
        System.out.println("Исходный массив:");
        System.out.println(printArray(array));

        try(FileWriter writer = new FileWriter("task2_log.txt")) {

            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    totalIter++;
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                    writer.write("Итерация " + totalIter + ": " + printArray(array));
                    writer.write(System.lineSeparator());
                    writer.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Отсортированный массив:");
        System.out.println(printArray(array));
        System.out.println("Количество итераций: " + totalIter);
    }

    public static String printArray(int[] array) {
        StringBuilder arrayStr = new StringBuilder();
        for (int elem : array) {
            arrayStr.append(elem + " ");
        }
        return arrayStr.toString();
    }
}
