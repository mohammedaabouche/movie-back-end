package org.example.movieapp.entite;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "Comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String user;

    private int filmid;
    private String comment;


    // Constructors, Getters, Setters...

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setFilmid(int filmid) {
        this.filmid = filmid;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUser() {
        return user;
    }

    public int getFilmid() {
        return filmid;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getComment() {
        return comment;
    }


}
