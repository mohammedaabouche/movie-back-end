package org.example.movieapp.repository;
import org.example.movieapp.entite.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {
    List<Film> findByUser(String userId);
    Film findByUserAndFilmid(String userId,int filmId);
}

