package ru.shlegel.api.homework3;

import java.util.ArrayList;

public class MinArrayElement {
    public static void getMinArrayElem(ArrayList<Integer> someArray) {
        int minElem = someArray.get(0);
        for (int elem: someArray) {
            if (elem < minElem) {
                minElem = elem;
            }
        }
        System.out.println("Минимальное значение: " + minElem);
    }
}
