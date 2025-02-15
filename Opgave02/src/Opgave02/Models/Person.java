package Opgave02.Models;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}


