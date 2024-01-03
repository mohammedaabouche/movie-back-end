package org.example.movieapp.controller;

import org.example.movieapp.entite.Film;
import org.example.movieapp.services.FavorsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class FavorsController {
    private FavorsServices favorsService;

    @Autowired
    public FavorsController(FavorsServices favorsService) {
        this.favorsService = favorsService;
    }

    @PostMapping("/add")
    public ResponseEntity<Film> addFilmToFav(@RequestBody Film film) {
        System.out.println(film.toString());
        Film addedFilm = this.favorsService.addFilm(film);
        return ResponseEntity.ok(addedFilm);
    }

    @PostMapping("/get")
    public List<Film> getFavoriteFilms(@RequestBody String userid) {
        List<Film> favoriteFilms = this.favorsService.getFilmsByUserId(userid); // Modify this to retrieve all favorite films
        return favoriteFilms;
    }

    @PostMapping("/getfilm")
    public Film getFavoriteFilms(@RequestBody  Film film) {
        return this.favorsService.getFilm(film);
    }


}
