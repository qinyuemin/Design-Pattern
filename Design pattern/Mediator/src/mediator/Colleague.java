/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator m) {
        this.mediator = m;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void action();
}
