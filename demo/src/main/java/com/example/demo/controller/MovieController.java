package com.example.demo.controller;

import com.example.demo.model.MovieModel;
import com.example.demo.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private final MovieService movieService;

    MovieController(MovieService movieService){
        this.movieService=movieService;
    }
    @GetMapping("movies")
    public ResponseEntity<List<MovieModel>> getMoviesList(){
        return ResponseEntity.ok(movieService.getMoviesList());
    }
}
