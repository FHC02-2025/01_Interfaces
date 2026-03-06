package org.campus02.sorting;

import java.nio.charset.StandardCharsets;

public class Person implements Sortable, Sortable2<Person> {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int sortValue() {
        return age;
    }

    @Override
    public int sortValue(Person other) {
        return name.compareTo(other.getName()); // 1 ... größer, 0 ... gleich, -1 ... kleiner
    }
}
