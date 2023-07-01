package ru.shlegel.api.homework3;

import java.util.ArrayList;
import java.util.Collections;

public class AvarageValue {

    public static void getAverageValue(ArrayList<Integer> someList) {

        if (someList.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }

        int sum = 0;
        for (int elem: someList) {
            sum += elem;
        }

        double average = (double) sum / someList.size();
        System.out.println("Среднее значение: " + average);
    }
}
