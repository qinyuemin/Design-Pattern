/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

public class PCMagazin implements Magazin {

    private String magazinName;

    public PCMagazin(String name) {
        this.magazinName = name;
    }

    @Override
    public void accept(Visitor v) {
        this.showMagazinName();
        v.visite(this);
    }

    public void showMagazinName() {
        System.out.println("Vous etes en trains de visiter " + this.magazinName);
    }
}
