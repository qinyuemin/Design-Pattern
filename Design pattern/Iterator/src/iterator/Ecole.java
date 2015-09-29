/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

public interface Ecole {

    public void ShowEcoleName();

    public void addEtudiant(Etudiant student);

    public void removeEtudiant(Etudiant student);

    public void countEtudiant();

    public Iterator createIterator();
}
