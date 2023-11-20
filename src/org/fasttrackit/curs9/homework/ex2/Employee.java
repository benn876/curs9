package org.fasttrackit.curs9.homework.ex2;

import java.time.LocalDate;

public class Employee implements Person {
    private final LocalDate dateOfEmployment;
    private final String position;
    private final String firstName;
    private final LocalDate birthday;

    public Employee(LocalDate dateOfEmployment, String position, String firstName, LocalDate birthday) {
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
        this.firstName = firstName;
        this.birthday = birthday;
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public LocalDate getBirthday() {
        return birthday;
    }
}
