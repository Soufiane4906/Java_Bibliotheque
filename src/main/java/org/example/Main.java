package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livre l1 = new Livre("ahmed sefrioui","la boite", 1915,"BB1569");
        Livre l2 = new Livre("ahmed ","la ", 115,"BB569");
        Livre l3 = new Livre("lila","llilo", 2002,"pop89");

        List<Livre> lista = new ArrayList<>();
        lista.add(l1);
        lista.add(l2);
        lista.add(l3);

        Membre m1 = new Membre("soufiane",2001,lista);

        System.out.println(m1.toString());




        // Emprunt e1= new Emprunt();
    }
}