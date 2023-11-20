package org.fasttrackit.curs9.homework.ex2;

import java.time.LocalDate;

public class Programmer extends Employee {
    private final String language;

    public Programmer(LocalDate dateOfEmployment, String position, String firstName, LocalDate birthday, String language) {
        super(dateOfEmployment, position, firstName, birthday);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getPosition() {
        return "programmer";
    }
}
