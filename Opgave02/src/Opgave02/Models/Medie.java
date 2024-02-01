package Opgave02.Models;

import java.util.ArrayList;

public class Medie {

    private String title;
    private ArrayList<Actor> cast;
    private Genre[] genres;

    public Medie(String title, ArrayList<Actor> cast, Genre[] genres) {
        this.title = title;
        this.cast = cast;
        this.genres = genres;
    }

    protected String getTitle() {
        return title;
    }
}
