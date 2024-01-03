package org.example.movieapp.entite;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "Films")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String user;

    private int filmid;



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

    public String getUser() {
        return user;
    }

    public int getFilmid() {
        return filmid;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", filmid=" + filmid +
                '}';
    }
}
