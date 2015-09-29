package pkgabstract.factory;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Etudiant implements Homme {

    public String nom;

    public Etudiant() {
        this.nom = null;
    }

    public Etudiant(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void ShowNom() {
        if (this.nom != null) {
            System.out.println("My name is: " + this.nom);
        } else {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
