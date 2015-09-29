/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

public class HasPCState implements PCState {

    @Override
    public void ShowPCState() {
        System.out.println("Has PC in store!");
    }

    @Override
    public void ChangeState(Magazin m) {
        m.setPCState(new NoPCState());
    }
}
