package org.example.movieapp.services;
import org.example.movieapp.entite.Film;
import org.example.movieapp.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavorsServices {
    private final FilmRepository filmRepository;

    @Autowired
    public FavorsServices(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public Film addFilm(Film film) {
        return filmRepository.save(film);
    }

    public List<Film> getFilmsByUserId(String userId) {
        return filmRepository.findByUser(userId); // Example assuming method in FilmRepository
        // Modify this method based on your entity relationships and repository methods
    }

    public Film getFilm(Film film){
        return filmRepository.findByUserAndFilmid(film.getUser(),film.getFilmid());
    }
}

