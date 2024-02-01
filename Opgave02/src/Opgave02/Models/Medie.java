package Opgave02.Models;

import java.util.ArrayList;
import java.util.List;

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

    public ArrayList<Genre> getGenre() {
        return new ArrayList<Genre>(List.of(genres));
    }
}
