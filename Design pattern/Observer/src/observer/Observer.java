/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

public abstract class Observer {

    protected String ObvName;

    public Observer(Machine m,String name) {
        this.ObvName = name;
    }

    public abstract void update();

    public String getObvName() {
        return this.ObvName;
    }
}
