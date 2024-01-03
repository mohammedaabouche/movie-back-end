package org.example.movieapp.services;
import org.example.movieapp.entite.Comment;
import org.example.movieapp.entite.Film;
import org.example.movieapp.repository.CommentRepository;
import org.example.movieapp.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServices {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentsServices(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByFilmId(int filmId) {
        return commentRepository.findAllByFilmid(filmId);
    }


}

