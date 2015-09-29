/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

public class StopWorkCommand extends Command {

    private Ouvrier ouvrier;
    private state commandState;

    public StopWorkCommand(Ouvrier o) {
        this.ouvrier = o;
        this.commandState = state.TRVAILLE;
    }

    @Override
    public void execute() {
        this.ouvrier.action(commandState);
        this.commandState = state.REPO;
        System.out.println("Les ouvriers sont en " + this.commandState);
    }
}
