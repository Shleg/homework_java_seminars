package ru.shlegel.api.homework4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        LinkedList<Object> originalList = new LinkedList<>();
        originalList.addAll(List.of("asd", 2, "56", 4, 5));


        System.out.println("Original List: " + originalList);
        System.out.println("Reversed List1: " + reverseList(originalList));
        System.out.println("Reversed List2: " + reverseList2(originalList));
        System.out.println("Reversed List3: " + reverseList3(originalList));
    }

    public static <T> LinkedList<T> reverseList(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>(list);
        Collections.reverse(reversedList);

        return reversedList;
    }

    public static <T> LinkedList<T> reverseList2(LinkedList<T> list) {
        LinkedList<T> reversedList2 = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList2.add(list.get(i));
        }

        return reversedList2;
    }

    public static <T> List<T> reverseList3(List<T> list) {
        LinkedList<T> reversedList3 = new LinkedList<>();
        for (T element : list) {
            reversedList3.addFirst(element);
        }
        return reversedList3;
    }
}

