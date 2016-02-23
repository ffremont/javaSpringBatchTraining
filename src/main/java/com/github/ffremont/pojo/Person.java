/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ffremont.pojo;

/**
 *
 * @author florent
 */
public class Person {
    private int id;
    private String nom;
    private String prenom;
    private String civilite;
    private String prenomNom;

    public Person() {
    }
    
    public Person(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = "M.";
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getPrenomNom() {
        return prenomNom;
    }

    public void setPrenomNom(String prenomNom) {
        this.prenomNom = prenomNom;
    }
    
    
    
}
