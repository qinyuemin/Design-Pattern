/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

public class LenovoPC implements PC {

    private int pcPrice;

    public LenovoPC(int price) {
        this.pcPrice = price;
    }

    @Override
    public void ShowPCBrand() {
        System.out.println("This is a Lenovo PC!");
    }

    @Override
    public void ShowPCPrice() {
        if (this.pcPrice >= 0) {
            System.out.println("This Lenovo PC's price is " + this.pcPrice);
        } else {
            System.out.println("No price for this Lenovo PC!");
        }
    }
}
