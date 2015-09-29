/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.*;

public abstract class Machine {

    protected String machineName;
    protected Vector observers;

    public Machine() {
        this.machineName = null;
        this.observers = new Vector();
    }

    public abstract void attach(Observer obv);

    public abstract void detach(Observer obv);

    public abstract void annonce();
}
