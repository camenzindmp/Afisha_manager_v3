package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.MoviesList;
import ru.netology.repository.AfishaRepository;

import javax.xml.namespace.QName;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class AfishaRepositoryTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager;
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
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }

    @Test
    void findAll() {
    }

    @Test
    void save() {
    }

    @Test
    void findById() {
    }

    @Test
    void removeById() {
    }

    @Test
    void removeAll() {
    }
}