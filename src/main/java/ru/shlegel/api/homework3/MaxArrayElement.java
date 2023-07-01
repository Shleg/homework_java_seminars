package ru.shlegel.api.homework3;

import java.util.ArrayList;

public class MaxArrayElement {
    public static void getMaxArrayElem(ArrayList<Integer> someArray) {
        int maxElem = someArray.get(0);
        for (int elem: someArray) {
            if (elem > maxElem) {
                maxElem = elem;
            }
        }
        System.out.println("Максимальное значение: " + maxElem);
    }
}
