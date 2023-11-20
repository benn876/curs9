package org.fasttrackit.curs9.homework.ex2;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee {
    private final String dbTechnology;

    public DatabaseAdmin(LocalDate dateOfEmployment, String position, String firstName, LocalDate birthday, String dbTechnology) {
        super(dateOfEmployment, position, firstName, birthday);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }
}
