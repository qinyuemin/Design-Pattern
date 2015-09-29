/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibilitychain;

public class Directeur extends Person {

    public Directeur() {
        this.position = "Directeur";
    }

    @Override
    public void HandleRequest(String request) {
        if ("Passer le budget de l'ecole".equals(request)) {
            this.ShowPosition();
            System.out.println("J'ai prepare le budget de l'ecole");
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
