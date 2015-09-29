/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

public class Magazin {

    private PC pc;

    public Magazin(PC ordinateur) {
        this.pc = ordinateur;
    }

    public void ShowPCInfo() {
        if (this.pc != null) {
            this.pc.ShowPCBrand();
            this.pc.ShowPCPrice();
        } else {
            System.out.println("No PC info!");
        }
    }
}
