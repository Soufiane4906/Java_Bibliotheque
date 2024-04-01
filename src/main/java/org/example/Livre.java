package org.example;

import java.util.Date;

public class Livre {

    private String Titre;
    private String Auteur;
    private int AnneePublication;
    private String  ISBN;

    public Livre() {
    }
public Livre(String Titre,String Auteur,int Annee , String  ISBN){

    this.Titre=Titre;
    this.Auteur=Auteur;
    this.AnneePublication=Annee;
    this.ISBN=ISBN;
}

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String auteur) {
        Auteur = auteur;
    }

    public int getAnneePublication() {
        return AnneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        AnneePublication = anneePublication;
    }

    public String  getISBN() {
        return ISBN;
    }

    public void setISBN(String  ISBN) {
        this.ISBN = ISBN;
    }
}
