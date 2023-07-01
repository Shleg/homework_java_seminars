package ru.shlegel.api.homework3;

import java.util.ArrayList;
import java.util.Random;
public class MyArrayList {

    public static ArrayList<Integer> getRandomArray() {

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = random.nextInt(8,20);
        for (int i = 0; i < size; i++){
            arrayList.add(random.nextInt(30));
        }
        System.out.println("Список целых чисел: " + arrayList);
        return arrayList;
    }
}
