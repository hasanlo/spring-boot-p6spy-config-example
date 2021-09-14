package com.hasanlo.p6spy.service.implement;

import com.hasanlo.p6spy.domain.entity.Movie;
import com.hasanlo.p6spy.domain.repository.MovieRepository;
import com.hasanlo.p6spy.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllMovies() {
        log.info("getAllMovies service start");
        return movieRepository.findAll();
    }
}
