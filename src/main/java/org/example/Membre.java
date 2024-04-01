package org.example;

import org.example.Livre;

import java.util.ArrayList;
import java.util.List;
public class Membre {
    private String Nom;
    private int num_membre;
    private List<Livre> livre_emprunts;

    public Membre(String nom, int num_membre, List<Livre> livre_emprunts) {
        Nom = nom;
        this.num_membre = num_membre;
        this.livre_emprunts = new ArrayList<>();
    }
    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public Membre() {

    }

    public int getNum_membre() {
        return num_membre;
    }

    public void setNum_membre(int num_membre) {
        this.num_membre = num_membre;
    }

    public List<Livre> getLivre_emprunts() {
        return livre_emprunts;
    }
    public void addlivre(Livre livre){
        livre_emprunts.add(livre);
    }

    //Suppression des livres par nom Auteur
    public void removeLivre(Livre L){
    livre_emprunts.remove(L);
    }
    public void setLivre_emprunts(List<Livre> livre_emprunts) {
        this.livre_emprunts = livre_emprunts;
    }

    @Override
    public String toString() {
        String ListStringLivre = "List Livres : ";

        for (Livre livre : this.livre_emprunts) {
            ListStringLivre += livre.getTitre() + ", ";
        }
        return "Membre{" +
                "Nom='" + this.getNom() + '\'' +
                ", num_membre=" + this.getNum_membre() +
                ", livre_emprunts=" + ListStringLivre +
                '}';
    }

}