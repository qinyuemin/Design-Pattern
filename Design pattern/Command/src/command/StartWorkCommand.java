/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

enum state {

    REPO, TRVAILLE
}

public class StartWorkCommand extends Command {

    private Ouvrier ouvrier;
    private state commandState;

    public StartWorkCommand(Ouvrier o) {
        this.ouvrier = o;
        this.commandState = state.REPO;
        System.out.println("Les ouvriers sont en " + this.commandState);
    }

    @Override
    public void execute() {
        this.ouvrier.action(commandState);
        this.commandState = state.TRVAILLE;
        System.out.println("Les ouvriers sont en " + this.commandState);
    }
}
