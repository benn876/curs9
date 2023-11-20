package org.fasttrackit.curs9.homework.ex2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person aProgrammer = new Programmer(LocalDate.of(2020, 7, 4),
                "Automated Test",
                "Mihai",
                LocalDate.of(1990, 4, 12),
                "java");

        PersonData personData = new PersonData(aProgrammer);
        System.out.println(personData.getPersonFullName());

        System.out.println(personData.getAge());
    }
}
