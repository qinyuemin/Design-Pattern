/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

public class Caretaker {

    private Memento memo;

    public Caretaker() {
        this.memo = null;
    }

    public Caretaker(Memento m) {
        this.memo = m;
    }

    public Memento getMemo() {
        return memo;
    }

    public void setMemo(Memento memo) {
        this.memo = memo;
    }
}
