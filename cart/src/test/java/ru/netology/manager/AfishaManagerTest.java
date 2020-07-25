package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.manager.AfishaManager;
import ru.netology.domain.MoviesList;

import javax.xml.namespace.QName;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {

    @Test
    public void addMovie() {
        AfishaManager manger = new AfishaManager();
        MoviesList quantity = new MoviesList(10);
        MoviesList first = new MoviesList(1, "first");
        MoviesList second = new MoviesList(2, "second");
        MoviesList third = new MoviesList(3, "third");
        MoviesList fourth = new MoviesList(4, "fourth");
        MoviesList fifth = new MoviesList(5, "fifth");
        MoviesList sixth = new MoviesList(6, "sixth");
        MoviesList seventh = new MoviesList(7, "seventh");
        MoviesList eighth = new MoviesList(8, "eighth");
        MoviesList ninth = new MoviesList(9, "ninth");
        MoviesList tenth = new MoviesList(10, "tenth");
        manger.addMovie(first);
        manger.addMovie(second);
        manger.addMovie(third);
        manger.addMovie(fourth);
        manger.addMovie(fifth);
        manger.addMovie(sixth);
        manger.addMovie(seventh);
        manger.addMovie(eighth);
        manger.addMovie(ninth);
        manger.addMovie(tenth);

        MoviesList[] actual = manger.getMovies();
        MoviesList[] expected = new MoviesList[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}