package org.example.movieapp.repository;

import org.example.movieapp.entite.Comment;
import org.example.movieapp.entite.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByFilmid(int filmid);
}
