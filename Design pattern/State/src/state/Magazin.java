/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

public class Magazin {

    private PCState state;
    private int PCNumber;

    public Magazin(int number) {
        if (number > 0) {
            state = new HasPCState();
        } else {
            state = new NoPCState();
        }
        this.PCNumber = number;
        System.out.println("There are " + this.PCNumber + " PC in magazin!");
        state.ShowPCState();
    }

    public void setPCState(PCState state) {
        this.state = state;
    }

    public void buy(int number) {
        if (this.PCNumber - number >= 0 && this.PCNumber != 0) {
            this.PCNumber = this.PCNumber - number;
            System.out.println("There are " + this.PCNumber + " PC in magazin!");
        } else if (this.PCNumber != 0) {
            this.PCNumber = 0;
            state.ChangeState(this);
            state.ShowPCState();
        } else {
            state.ShowPCState();
        }
    }
}
