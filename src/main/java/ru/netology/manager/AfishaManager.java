package ru.netology.manager;

import ru.netology.repository.AfishaRepository;
import ru.netology.domain.MoviesList;

public class AfishaManager {
    private AfishaRepository repository;



    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }

    public void add(MoviesList movie) {
        repository.save(movie);
    }

    MoviesList[] getMovies() {
        MoviesList[] movies = repository.findAll();
        MoviesList[] result = new MoviesList[movies.length];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}