package com.omaryaya.practiceapp.service;

import com.omaryaya.practiceapp.model.Movie;
import com.omaryaya.practiceapp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> fetchAll() {
        return movieRepository.findAll();
    }

    public void save(List<Movie> movies) {
        movieRepository.saveAll(movies);
    }

    public void wipe() {
        movieRepository.deleteAll();
    }
}
