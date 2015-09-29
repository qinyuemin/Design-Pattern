/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibilitychain;

public class Ecole {
    //此模式类似于链表！
    public static void main(String[] args) {
        Person etudiant = new Etudiant();
        Person enseignant = new Enseignant();
        Person directeur = new Directeur();

        etudiant.setSuccessor(enseignant);
        enseignant.setSuccessor(directeur);

        etudiant.HandleRequest("Passer un examen");
        etudiant.HandleRequest("Preparer le cours");
        etudiant.HandleRequest("Passer le budget de l'ecole");
        etudiant.HandleRequest("Preparer une guerre");

        enseignant.HandleRequest("Passer un examen");
    }
}
