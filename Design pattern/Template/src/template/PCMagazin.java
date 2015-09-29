/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

public class PCMagazin extends Magazin {

    public PCMagazin(String name) {
        super(name);
        this.productAmount = 0;
    }

    @Override
    protected void ShowMagazinType() {
        System.out.println("This is a PC magazin!");
    }

    @Override
    public void Hook() {
        System.out.println("It's a hook function!");
        this.setProductAmount(productAmount + 100);
        this.HasProducts();
    }

    @Override
    protected void HasProducts() {
        if (this.productAmount <= 0) {
            System.out.println("No products in magazin!");
        } else {
            System.out.println("There are " + this.productAmount + " PC in magazin!");
        }
    }
}
