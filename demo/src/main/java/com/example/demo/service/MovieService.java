package com.example.demo.service;

import com.example.demo.model.MovieModel;
import com.example.demo.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    MovieService (MovieRepository movieRepository){
        this.movieRepository=movieRepository;
    }
    public List<MovieModel> getMoviesList(){
        return movieRepository.findAll().stream()
                .map(movies -> new MovieModel(
                        movies.getId(),
                        movies.getImdbId(),
                        movies.getTitle(),
                        movies.getReleaseDate(),
                        movies.getTrailerLink(),
                        movies.getGenres(),
                        movies.getPoster(),
                        movies.getBackdrops()
                ))
                .toList();

    }
}
