package org.fasttrackit.curs9.homework.ex2;

import java.time.LocalDate;

public class PersonData {
    private final Person person;

    public PersonData(Person person) {
        this.person = person;
    }

    public String getPersonFullName() {
        return person.getFirstName() + "FULLNAME";
    }

    public Integer getAge() {
        return LocalDate.now().getYear() - person.getBirthday().getYear();
    }
}
