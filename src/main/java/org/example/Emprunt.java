package org.example;

import java.time.LocalDateTime;
import java.util.Date;

public class Emprunt {
    private Membre Membre;
    private Livre Livre;
    private Date DateEmprunt;
    private LocalDateTime DateRetour;

    public Emprunt( Membre membre,  Livre livre, Date dateEmprunt, LocalDateTime dateRetour) {
        Membre = membre;
        Livre = livre;
        DateEmprunt = dateEmprunt;
        DateRetour = dateRetour;
    }

    public  Membre getMembre() {
        return Membre;
    }

    public void setMembre( Membre membre) {
        Membre = membre;
    }

    public  Livre getLivre() {
        return Livre;
    }

    public void setLivre( Livre livre) {
        Livre = livre;
    }

    public Date getDateEmprunt() {
        return DateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        DateEmprunt = dateEmprunt;
    }

    public LocalDateTime getDateRetour() {
        return DateRetour;
    }

    public void setDateRetour(LocalDateTime dateRetour) {
        DateRetour = dateRetour;
    }
}
