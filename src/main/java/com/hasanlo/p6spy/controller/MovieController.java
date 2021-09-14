package com.hasanlo.p6spy.controller;

import com.hasanlo.p6spy.domain.entity.Movie;
import com.hasanlo.p6spy.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
@Slf4j
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovie() {
        log.info("getAllMovies rest start");
        List<Movie> allMovies = movieService.getAllMovies();
        return new ResponseEntity(allMovies, allMovies.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }
}
