/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

public class PCProduceur extends Colleague {

    private String PCBrand;
    private String CPU;

    public PCProduceur(Mediator m, String pcname, String cpu) {
        super(m);
        this.PCBrand = pcname;
        this.CPU = cpu;
    }

    @Override
    public void action() {
        this.mediator.ShowClientInfo();
    }

    public void ShowPCInfo() {
        System.out.println("C'est un " + this.PCBrand + " PC. Son CPU est " + this.CPU + "!");
    }
}
