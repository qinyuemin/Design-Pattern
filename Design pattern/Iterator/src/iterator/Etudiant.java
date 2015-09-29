/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

public class Etudiant {

    private String name;

    public Etudiant(String nom) {
        this.name = nom;
    }

    public void ShowName() {
        System.out.println("Je suis " + this.name);
    }
}
