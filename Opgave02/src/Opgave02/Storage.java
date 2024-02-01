package Opgave02.Storage;

import Opgave02.Models.Actor;
import Opgave02.Models.Director;
import Opgave02.Models.Movie;
import Opgave02.Models.TVSerie;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<TVSerie> series = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<Actor>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void addTVSerie(TVSerie serie) {
        series.add(serie);
    }

    public void printAllMoviesAndSeries() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        for (TVSerie tvSerie : series) {
            System.out.println(tvSerie);
        }
    }

    public ArrayList<Movie> findMoviesWithDirector(Director director) {
        ArrayList<Movie> directorMovies = new ArrayList<>();

        for (Movie movie : this.movies) {
            if (movie.getDirector().equals(director)) {
                directorMovies.add(movie);
            }
        }
        return directorMovies;
    }
}
