/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibilitychain;

public class Enseignant extends Person {

    public Enseignant() {
        this.position = "Enseignant";
    }

    @Override
    public void HandleRequest(String request) {
        if ("Preparer le cours".equals(request)) {
            this.ShowPosition();
            System.out.println("J'ai prepare le cours");
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
