package Opgave02.Models;

import java.util.ArrayList;

public class Movie extends Medie {
    private int productionYear;
    private Director director;
    private double rating;

    public Movie(String title, ArrayList<Actor> cast, Genre[] genres, int productionYear, Director director, double rating) {
        super(title, cast, genres);
        this.productionYear = productionYear;
        this.director = director;
        this.rating = rating;
    }

    public String toString() {
        return super.getTitle();
    }

    public Director getDirector() {
        return director;
    }
}
