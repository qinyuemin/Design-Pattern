/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibilitychain;

public class Etudiant extends Person {

    public Etudiant() {
        this.position = "Etudiant";
    }

    @Override
    public void HandleRequest(String request) {
        if ("Passer un examen".equals(request)) {
            this.ShowPosition();
            System.out.println("J'ai passe un examen");
        } else {
            System.out.println("Je suis " + this.position + ". Je ne me charge de " + request + ". Cette tache est passe a mon successor");
            if (this.successor != null) {
                this.successor.HandleRequest(request);
            } else {
                System.out.println("Il n'y a pas successor");
            }
        }
    }
}
