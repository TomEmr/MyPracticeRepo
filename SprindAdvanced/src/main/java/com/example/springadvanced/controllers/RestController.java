package com.example.springadvanced.controllers;

import com.example.springadvanced.models.Movie;
import com.example.springadvanced.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final MovieService movieService;

    @Autowired
    public RestController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("movie/{id}")
    public Movie getMovieById(@PathVariable("id") int movieId) throws IOException {
        return movieService.getMovieById(movieId);
    }

}
