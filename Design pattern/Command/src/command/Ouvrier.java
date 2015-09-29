/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

public class Ouvrier {

    private String name;
    private state commandState;

    public Ouvrier(String name) {
        this.name = name;
    }

    public void action(state cstate) {
        this.commandState = cstate;
        switch (this.commandState) {
            case REPO:
                System.out.println("Monsieur " + name + " commence a travailler!");
                break;
            case TRVAILLE:
                System.out.println("Monsieur " + name + " arrete a travailler!");
                break;
        }
    }
}
