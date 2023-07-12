package ru.shlegel.api.homework6;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Cat {
    private String name;
    private int age;
    private String color;
    private static final List<String> ALLOWED_COLORS = Arrays.asList("Red", "Blue", "Green", "Black", "White");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public String setColor() {
        Random random = new Random();
        int index = random.nextInt(ALLOWED_COLORS.size());
        return ALLOWED_COLORS.get(index);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = setColor();
    }

    public Cat(String name, int age, String color) {
        if ((!ALLOWED_COLORS.contains(color))){
            throw new RuntimeException("Цвет должен быть из списка: " + Arrays.toString(ALLOWED_COLORS.toArray()));
        }
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
        public int hashCode() {
            return Objects.hash(name, age, color);
        }


    @Override
    public String toString() {
        return String.format("\nCat: name=%s, age=%d, color=%s", name, age, color);
    }

}
