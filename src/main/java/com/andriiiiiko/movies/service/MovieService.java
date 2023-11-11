package com.andriiiiiko.movies.service;

import com.andriiiiiko.movies.repository.MovieRepository;
import com.andriiiiiko.movies.entity.MovieEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    public final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieEntity> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<MovieEntity> getMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
