package Opgave02.Storage;

import Opgave02.Models.*;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<TVSerie> series = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<Actor>();
    private ArrayList<Medie> medier = new ArrayList<Medie>();

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
        System.out.println("All movies: ");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println("All series: ");
        for (TVSerie tvSerie : series) {
            System.out.println(tvSerie);
        }
        System.out.println();
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

    public ArrayList<Medie> seriesWithGenre(ArrayList<Genre> genreArrayList) {
        ArrayList<Medie> genreSeries = new ArrayList<>();

        for (Medie medie : medier) {
            int i = 0;
            while (!genreSeries.contains(medie) && i < genreArrayList.size()) {
                Genre k = genreArrayList.get(i);
                if (medie.getGenre().contains(k)) {
                    genreSeries.add(medie);
                }
                i++;
            }
        }

        return genreSeries;
    }

    public void addMedie(Medie medie) {
        if (!medier.contains(medie)) {
            medier.add(medie);
        }
    }
}
