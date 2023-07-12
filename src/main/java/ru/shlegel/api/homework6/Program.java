package ru.shlegel.api.homework6;

import java.util.Arrays;
import java.util.HashSet;

public class Program {

    public static void main(String[] args) {

        HashSet<Cat> catHashSet = new HashSet<>();
        Cat cat1 = new Cat("Vasya", 5);
        Cat cat2 = new Cat("Pushok", 7);
        Cat cat3 = new Cat("Barsik", 7, "White");
        Cat cat4 = new Cat("Barsik", 7, "White");
        Cat cat5 = new Cat("Barsik", 7, "White");
        catHashSet.addAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5));

        // следующая команда вернет false, если метод equals() не переопределен!
        // если переопределен - то вернет true
        System.out.println(cat3.equals(cat4));

        // catHashSet.add(new Cat("Pushok", 7, "Wwwwe")); - тут вызывается исключение, прописанное в конструкторе класса

        // тут выводим нашу коллекцию, причем если метод hashCode() не переопределен, то в коллекции будет 5 котов
        // в противном случае будет 3 кота
        System.out.println(catHashSet);



    }
}
