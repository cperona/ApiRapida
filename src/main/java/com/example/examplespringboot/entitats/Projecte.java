package com.example.examplespringboot.entitats;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Projecte {
    @Id
    private long id;

    private String nom;
    private String estat;

    public Projecte() {
    }
    public Projecte(String nom, String estat) {
        this.nom = nom;
        this.estat = estat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }
}
