package ru.netology.repository;

import ru.netology.domain.MoviesList;

public class AfishaRepository {

    private MoviesList[] movies = new MoviesList[0];

    public MoviesList[] findAll() { // по идее как getAll;
        return movies;
    }

    public void save(MoviesList movie) {
        int length = movies.length + 1;
        MoviesList[] tmp = new MoviesList[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MoviesList findById(int movieId) {
        for (MoviesList movie : movies) {
            if (movie.getMovieId() == movieId) {
                return movie;
            }
        }
        return null;
    }

    public MoviesList[] removeById(int movieId) {
        int length = movies.length - 1;
        MoviesList[] tmp = new MoviesList[length];
        int index = 0;
        for (MoviesList movie : movies) {
            if (movie.getMovieId() != movieId) {
                tmp[index] = movie;
                index++;
            }
        }
        movies = tmp;
        return tmp;
    }

    public MoviesList[] removeAll() {
        MoviesList[] tmp = new MoviesList[0];
        movies = tmp;
        return tmp;
    }
}