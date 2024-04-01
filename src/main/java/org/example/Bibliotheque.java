package org.example;

import java.lang.reflect.Member;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Bibliotheque {

    private List<Livre> Livres;
    private List<Membre> Membre;
    private List<Emprunt> Emprunt;

    public List<Livre> getLivres() {
        return Livres;
    }

    public void setLivres(List<Livre> livres) {
        Livres = livres;
    }

    public List<org.example.Membre> getMembre() {
        return Membre;
    }

    public void setMembre(List<org.example.Membre> membre) {
        Membre = membre;
    }

    public List<org.example.Emprunt> getEmprunt() {
        return Emprunt;
    }

    public void setEmprunt(List<org.example.Emprunt> emprunt) {
        Emprunt = emprunt;
    }

    public Bibliotheque(List<Livre> livres, List<org.example.Membre> membre, List<org.example.Emprunt> emprunt) {
        Livres = livres;
        Membre = membre;
        Emprunt = emprunt;
    }


//l'ajout de nouveaux livres

    public void addLivres(Livre Livre){
        this.Livres.add(Livre);
    }

    public void addLivres(List<Livre> ListLivre){
        this.Livres.addAll(ListLivre);
    }


   //•	Enregistrer un nouveau membre

    public void addMember(Member M){
        this.Membre.add((Membre) M);
    }

    public void Emprunter(Membre M , Livre L){
    if (this.Membre.contains(M)) {
        M.addlivre(L);
        Emprunt E=new Emprunt(M,L,new Date(),null) ;
        this.Emprunt.add(E);
        this.Livres.remove(L);
    }
    else {


        Membre M_A_Ajouter=new Membre();
        M_A_Ajouter.addlivre(L);
        Emprunt E=new Emprunt(M_A_Ajouter,L,new Date(),null) ;
        this.Membre.add(M_A_Ajouter);
        this.Emprunt.add(E);
        this.Livres.remove(L);
    }
    }

    public void retournerLivre(Membre M , Livre L){

            M.removeLivre(L);
            this.Livres.add(L);


        for (Emprunt E : this.Emprunt){
            if (E.getLivre().equals(L) && E.getMembre().equals(M))

                E.setDateRetour(LocalDateTime.now());
        }
        }



    }


