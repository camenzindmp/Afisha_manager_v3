package ru.netology.manager;

import ru.netology.domain.MovieList;

public class AfishaManager {
    private MovieList[] movies = new MovieList[0];

    public void addMovie(MovieList movie) {
        int length = movies.length + 1;
        MovieList[] tmp = new MovieList[length];
        //for (int i = 0; i < movies.length; i++) {
        //   tmp[i] = movies[i];
        // }
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    private MovieList[] getMovies() {
        MovieList[] result = new MovieList[movies.length];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}