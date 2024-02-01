package Opgave02.Models;

import java.util.ArrayList;

public class TVSerie extends Medie{
    private int numberOfSeasons;

    public TVSerie(String title, ArrayList<Actor> cast, Genre[] genres, int numberOfSeasons) {
        super(title, cast, genres);
        this.numberOfSeasons = numberOfSeasons;
    }

    @Override
    public String toString() {
        return super.getTitle();
    }
}
