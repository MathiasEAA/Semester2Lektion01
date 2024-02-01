package Opgave02.Models;

import java.time.LocalDate;

public class Actor {
    private String name;
    private LocalDate birthday;

    public Actor(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String toString() {
        return name;
    }
}
