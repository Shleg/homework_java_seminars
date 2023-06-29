package ru.shlegel.api.homework2;
import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        task3();
    }
    public static void task3() {
        System.out.println("\nЗадача 3: Студенты\n");

        String filePath = "task3.json";

        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));

            Gson gson = new Gson();
            List<Student> students = Arrays.asList(gson.fromJson(jsonString, Student[].class));

            StringBuilder stringBuilder = new StringBuilder();
            for (Student student : students) {
                stringBuilder.append("Студент ")
                        .append(student.lastName)
                        .append(" получил ")
                        .append(student.score)
                        .append(" по предмету ")
                        .append(student.theme)
                        .append(".")
                        .append(System.lineSeparator());
            }
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Student {
    public String lastName;
    public int score;
    public String theme;
}




