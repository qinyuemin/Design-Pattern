/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

public class Patron {

    private Command command;

    public Patron() {
        this.command = null;
    }

    public Patron(Command c) {
        this.command = c;
    }

    public void setCommand(Command c) {
        this.command = c;
    }

    public void startCommand() {
        if (this.command != null) {
            this.command.execute();
        } else {
            System.out.println("Le command n'est pas enregistre");
        }
    }
}
