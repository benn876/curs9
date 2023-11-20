package org.fasttrackit.curs9.code.collections;

public class Student {
    private Integer age;
    private String name;

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return age % 5;
    }

    @Override
    public String toString() {
        return "Student: %s, %s".formatted(age, name);
    }
}
