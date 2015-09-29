/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

public class PCClient extends Colleague {

    private String clientName;

    public PCClient(Mediator m, String name) {
        super(m);
        this.clientName = name;
    }

    @Override
    public void action() {
        this.mediator.ShowPCInfo();
    }

    public void ShowClientInfo() {
        System.out.println("Je suis " + this.clientName);
    }
}
