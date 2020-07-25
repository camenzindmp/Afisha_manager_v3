
package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MoviesList {
    private int movieId;
    private String movieName;
    private int quantityInFeed = 10;

    public MoviesList(int quantityInFeed) {
        this.quantityInFeed = quantityInFeed;
    }

    public MoviesList(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;

    }
}

