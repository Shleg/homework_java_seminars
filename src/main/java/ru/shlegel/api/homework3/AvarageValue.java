package ru.shlegel.api.homework3;

import java.util.ArrayList;

public class AvarageValue {

    public static void getAverageValue(ArrayList<Integer> someArray) {

        int sum = 0;
        for (int elem: someArray) {
            sum += elem;
        }
        int average = sum / someArray.size();
        System.out.println("Среднее значение: " + average);
    }
}
