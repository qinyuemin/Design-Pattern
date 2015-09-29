/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

public class NoPCState implements PCState {

    @Override
    public void ShowPCState() {
        System.out.println("NO PC in magazin!");
    }

    @Override
    public void ChangeState(Magazin m) {
        m.setPCState(new HasPCState());
    }
}
