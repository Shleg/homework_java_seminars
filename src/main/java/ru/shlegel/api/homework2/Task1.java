package ru.shlegel.api.homework2;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("\nЗадача 1: SQL-запрос\n");
        String query = "select * from students where ";
        Map<String, String> dict = new HashMap<>();
        dict.put("name", "Ivanov");
        dict.put("country", "Russia");
        dict.put("city", "Moscow");
        dict.put("age", "null");

        StringBuilder whereReq = new StringBuilder();

        for (Map.Entry<String, String> entry : dict.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (!value.equals("null")) {
                if (whereReq.length() > 0) {
                    whereReq.append(" AND ");
                }
                whereReq.append(key).append(" = '").append(value).append("'");
            }
        }

        String finalQuery = query + whereReq;
        System.out.println("Final Query: " + finalQuery);
    }
}
