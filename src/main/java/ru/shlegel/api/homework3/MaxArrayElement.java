package ru.shlegel.api.homework3;

import java.util.ArrayList;
import java.util.Collections;

public class MaxArrayElement {
    public static void getMaxArrayElem(ArrayList<Integer> someList) {
        if (someList.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }
        System.out.println("Минимальное значение: " + Collections.max(someList));
    }
}
