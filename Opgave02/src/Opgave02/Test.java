package Opgave02;

import Opgave02.Models.*;
import Opgave02.Storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Storage storage = initStorage();
        storage.printAllMoviesAndSeries();
    }

    private static Storage initStorage() {
        Storage storage = new Storage();
        Director georgeLukas = new Director("George Walton Lucas Jr.", LocalDate.of(1944, 5, 14));
        Director spielberg = new Director("Steven Spielberg", LocalDate.of(1946, 12, 18));
        Actor ford = new Actor("Harrison Ford", LocalDate.of(1942, 7, 13));
        storage.addActor(ford);
        Actor hamill = new Actor("Mark Hamill", LocalDate.of(1951, 9, 25));
        storage.addActor(hamill);
        Actor fisher = new Actor("Carrie Fisher", LocalDate.of(1965, 10, 21));
        storage.addActor(fisher);
        Actor allan = new Actor("Karen Allen", LocalDate.of(1951, 10, 5));
        storage.addActor(allan);
        Actor aniston = new Actor("Jennifer Aniston", LocalDate.of(1969, 2, 11));
        storage.addActor(aniston);
        Actor cox = new Actor("Courteney Cox", LocalDate.of(1964, 6, 15));
        storage.addActor(cox);
        Actor kudrow = new Actor("Lisa Kudrow", LocalDate.of(1963, 7, 30));
        storage.addActor(kudrow);
        Actor leBlanc = new Actor("Matt LeBlanc", LocalDate.of(1967, 7, 25));
        storage.addActor(leBlanc);
        Actor perry = new Actor("Matthew Perry", LocalDate.of(1969, 8, 19));
        storage.addActor(perry);
        Actor schwimmer = new Actor("David Schwimmer", LocalDate.of(1966, 11, 2));
        storage.addActor(schwimmer);
        Movie starWars = new Movie("Star Wars",new ArrayList<>(List.of(ford, hamill, fisher))
                ,new Genre[]{Genre.ACTION, Genre.FANTACY, Genre.ADVENTURE}
                ,1977, georgeLukas
                , 8.6
                );

        Movie indy = new Movie("Raiders of the Lost Ark", new ArrayList<>(List.of(ford, allan)),
                new Genre[]{Genre.ACTION, Genre.ADVENTURE}
                ,1981, spielberg
                , 8.4);

        TVSerie friends = new TVSerie("Friends",new ArrayList<>(List.of(aniston, cox, kudrow, leBlanc, perry, schwimmer))
                ,new Genre[] { Genre.COMEDY, Genre.ROMANCE}
                , 11
                );

        storage.addMovie(starWars);
        storage.addMovie(indy);
        storage.addTVSerie(friends);
        System.out.println(storage.findMoviesWithDirector(spielberg));
        return storage;
    }
}
