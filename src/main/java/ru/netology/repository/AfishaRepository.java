package ru.netology.repository;

import ru.netology.domain.MoviesList;

public class AfishaRepository {
    private MoviesList[] movies = new MoviesList[0];

    public MoviesList[] findAll() {
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

    public void findById() {

    }

    public void removeById(int id) {
        int length = movies.length -1;
        MoviesList[] tmp = new MoviesList[length];
        int index = 0;
        for (MoviesList movie : movies) {
            if (movie.getMovieId() != id) {
                tmp[index] = movie;
                index++;
            }
            else return;
        }
        movies = tmp;
    }

    public void removeAll() {

    }
}
