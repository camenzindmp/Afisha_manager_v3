package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ru.netology.domain.MoviesList;
import ru.netology.manager.AfishaManager;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.*;


class AfishaRepositoryTest {

    private AfishaRepository repository;
    private MoviesList first = new MoviesList(1, "first");
    private MoviesList second = new MoviesList(2, "second");
    private MoviesList third = new MoviesList(3, "third");
    private MoviesList fourth = new MoviesList(4, "fourth");
    private MoviesList fifth = new MoviesList(5, "fifth");
    private MoviesList sixth = new MoviesList(6, "sixth");
    private MoviesList seventh = new MoviesList(7, "seventh");
    private MoviesList eighth = new MoviesList(8, "eighth");
    private MoviesList ninth = new MoviesList(9, "ninth");
    private MoviesList tenth = new MoviesList(10, "tenth");

    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);
    }

    @Test
    void findAll() {
        AfishaRepository repository = new AfishaRepository();

        MoviesList[] actual = repository.findAll();
        MoviesList[] expected = new MoviesList[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void findById() {
        AfishaRepository repository = new AfishaRepository();
        int soughtId = 1;

        repository.findById(soughtId);

        MoviesList[] actual = repository.findById(1);
        MoviesList[] expected = new MoviesList[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeById() {
        AfishaRepository repository = new AfishaRepository();
        int idToRemove = 1;

        repository.removeById(idToRemove);

        MoviesList[] actual = repository.removeById(1);
        MoviesList[] expected = new MoviesList[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeAll() {
        MoviesList[] actual = repository.removeAll();
        MoviesList[] expected = new MoviesList[0];
    }
}