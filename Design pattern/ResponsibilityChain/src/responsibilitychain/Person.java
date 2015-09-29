/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibilitychain;

public abstract class Person {

    protected Person successor;
    protected String position;

    public Person() {
        this.position = null;
        this.successor = null;
    }

    public abstract void HandleRequest(String request);

    public void setSuccessor(Person peuple) {
        this.successor = peuple;
    }

    protected void ShowPosition() {
        if (this.position != null) {
            System.out.println("Je suis " + position);
        } else {
            System.out.println("!!!!!!!!!!!!!");
        }
    }
}
