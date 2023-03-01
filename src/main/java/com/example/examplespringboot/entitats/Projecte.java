package com.example.examplespringboot.entitats;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Projecte {
    @Id
    private long id;

    private String nom;
    private String estat;

    public long getId() {
        return this.id;
    }

    public Projecte(String nom, String estat) {
        this.nom = nom;
        this.estat = estat;
    }
}
