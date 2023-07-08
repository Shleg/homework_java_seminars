package ru.shlegel.api.homework5;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    private HashMap<String, List<String>> _phonebook;

    public Phonebook() {
        _phonebook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        List<String> phoneNumbers = _phonebook.getOrDefault(lastName, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        _phonebook.put(lastName, phoneNumbers);
    }

    public List<String> get(String lastName) {List<String> phoneNumbers = _phonebook.get(lastName);
        return _phonebook.getOrDefault(lastName, Collections.emptyList());
    }


    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "1234567890");
        phonebook.add("Петров", "9876543210");
        phonebook.add("Иванов", "5555555555");

        System.out.println("Иванов - найденные номера: " + phonebook.get("Иванов"));

        System.out.println("Петров - найденные номера: " + phonebook.get("Петров"));

        System.out.println("Козлов - найденные номера: " + phonebook.get("Козлов"));
    }
}
