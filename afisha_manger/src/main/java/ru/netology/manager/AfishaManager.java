package ru.netology.manager;

import ru.netology.domain.AfishaRepository;
import ru.netology.domain.MoviesList;

public class AfishaManager {
    private MoviesList[] movies = new MoviesList[0];
    private AfishaRepository repository;

    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }

    public AfishaManager(int quantityInFeed) {
        this.quantityInFeed = quantityInFeed;
    }

    private int quantityInFeed = 10;

    public void add(MoviesList movie) {
        int length = movies.length + 1;
        MoviesList[] tmp = new MoviesList[length];
        //for (int i = 0; i < movies.length; i++) {
        //   tmp[i] = movies[i];
        // }
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    MoviesList[] getMovies() {
        MoviesList[] result = new MoviesList[quantityInFeed];
        for (int i = 0; i < quantityInFeed; i++) {
            int index = quantityInFeed - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}