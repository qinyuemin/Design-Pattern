/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.*;

public class UTT implements Ecole {

    private Vector etudiantVector;
    private String ecoleName;

    public UTT() {
        this.ecoleName = "UTT";
        this.etudiantVector = new Vector();
        this.ShowEcoleName();
    }

    @Override
    public void ShowEcoleName() {
        if (this.ecoleName != null) {
            System.out.println("Bienvenu a " + this.ecoleName);
        } else {
            System.out.println("Non ecole!");
        }
    }

    @Override
    public void addEtudiant(Etudiant student) {
        this.etudiantVector.add(student);
    }

    @Override
    public void removeEtudiant(Etudiant student) {
        this.etudiantVector.remove(student);
    }

    @Override
    public void countEtudiant() {
        System.out.println("Il y a " + this.etudiantVector.size() + " etudiant chez " + this.ecoleName + "!");
    }

    @Override
    public Iterator createIterator() {
        return new EcoleIterator(this.etudiantVector);
    }
}
