package org.example.movieapp.controller;

import org.example.movieapp.entite.Comment;
import org.example.movieapp.entite.Film;
import org.example.movieapp.entite.Filmid;
import org.example.movieapp.services.CommentsServices;
import org.example.movieapp.services.FavorsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
@CrossOrigin(origins = "*")
public class CommentController {
    private CommentsServices commentsServices;

    @Autowired
    public CommentController(CommentsServices commentsServices) {
        this.commentsServices = commentsServices;
    }

    @PostMapping("/add")
    public ResponseEntity<Comment> addFilmToFav(@RequestBody Comment comment) {
        System.out.println(comment.toString());
        Comment addedcomment = this.commentsServices.addComment(comment);
        return ResponseEntity.ok(addedcomment);
    }

    @PostMapping("/get")
    public List<Comment> getFavoriteFilms(@RequestBody Filmid filmid) {
        List<Comment> comments = this.commentsServices.getCommentsByFilmId(filmid.getFilmid()); // Modify this to retrieve all favorite films
        return comments ;
    }




}