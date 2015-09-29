/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.lang.*;

public class PCMediator implements Mediator {

    private PCClient pcClient;
    private PCProduceur pcProduceur;

    public PCMediator() {
        this.pcClient = null;
        this.pcProduceur = null;
    }

    @Override
    public void ShowPCInfo() {
        if (this.pcProduceur != null) {
            this.pcProduceur.ShowPCInfo();
        } else {
            System.out.println("No PC Info!");
        }
    }

    @Override
    public void ShowClientInfo() {
        if (this.pcClient != null) {
            this.pcClient.ShowClientInfo();
        } else {
            System.out.println("No Client Info!");
        }
    }

    @Override
    public void setColleague(Colleague c) {
        if ("mediator.PCClient".equals(c.getClass().getName())) {
            this.pcClient = (PCClient) c;
        } else if ("mediator.PCProduceur".equals(c.getClass().getName())) {
            this.pcProduceur = (PCProduceur) c;
        }

    }
}
