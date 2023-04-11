package com.omaryaya.practiceapp.controller;

import com.omaryaya.practiceapp.model.Movie;
import com.omaryaya.practiceapp.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
@Slf4j
public class MovieController {


    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public ResponseEntity<Object> all() {
        try {
            return ResponseEntity.ok(movieService.fetchAll());

        } catch (Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity.internalServerError().body("Unexpected error has occurred");
        }
    }

    @PostMapping("/")
    public ResponseEntity<Object> save(@RequestBody Movie[] movies) {
        try {

            movieService.save(Arrays.asList(movies));
            return ResponseEntity.ok().build();

        } catch (Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity.internalServerError().body("Unexpected error has occurred");
        }
    }

    @DeleteMapping("/")
    public ResponseEntity<Object> wipe() {
        movieService.wipe();
        return ResponseEntity.ok("Database Wiped");
    }


}
