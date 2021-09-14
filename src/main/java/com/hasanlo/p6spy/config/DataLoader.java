package com.hasanlo.p6spy.config;

import com.hasanlo.p6spy.domain.entity.Movie;
import com.hasanlo.p6spy.domain.repository.MovieRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class DataLoader {

    private MovieRepository movieRepository;

    public DataLoader(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @PostConstruct
    private void loadData() {
        movieRepository.saveAll(List.of(
                new Movie("The Shawshank Redemption", 1, 9.3),
                new Movie("The Godfather", 2, 9.2),
                new Movie("The Dark Knight", 3, 9.0)
        ));
    }
}
