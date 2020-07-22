package ru.netology.manager;

import ru.netology.domain.MoviesList;

public class AfishaManager {
    private MoviesList[] movies = new MoviesList[0];

    public void addMovie(MoviesList movie) {
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

    private MoviesList[] getMovies() {
        MoviesList[] result = new MoviesList[movies.length];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}