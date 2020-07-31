package ru.netology.domain;

public class AfishaRepository {
    //закоммитил не в ту ветку
    private MoviesList[] movies = new MoviesList[0];
    private int quantityInFeed = 10;

    public MoviesList[] findAll() {
        MoviesList[] result = new MoviesList[quantityInFeed];
        for (int i = 0; i < quantityInFeed; i++) {
            int index = quantityInFeed - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public void save(MoviesList movie) {
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

    public void findById() {

    }

    public void removeById(int id) {
        int length = movies.length -1;
        MoviesList[] tmp = new MoviesList[length];
        int index = 0;
        for (MoviesList movie : movies) {
            if (movies.getId() != id) {
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
