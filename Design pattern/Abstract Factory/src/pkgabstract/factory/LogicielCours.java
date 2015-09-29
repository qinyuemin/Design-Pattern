package pkgabstract.factory;

import java.util.*;
import java.io.*;

public class LogicielCours implements Cours {

    public String nom;

    public LogicielCours() {
        this.nom = null;
    }

    public LogicielCours(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void ShowCourNom() {
        if (this.nom != null) {
            System.out.println("Nom du Cours est " + this.nom);
        } else {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
