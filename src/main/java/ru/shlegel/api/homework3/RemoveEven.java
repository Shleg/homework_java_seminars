package ru.shlegel.api.homework3;

import java.util.ArrayList;

public class RemoveEven {

    public static void removeEven(ArrayList<Integer> someArrayList){
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int elem: someArrayList){
            if (elem % 2 != 0){
                newArray.add(elem);
            }
        }
        System.out.println("Список без четных чисел: " + newArray);
    }
}
