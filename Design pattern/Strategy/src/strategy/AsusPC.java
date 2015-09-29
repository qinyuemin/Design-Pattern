/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

public class AsusPC implements PC {

    private int pcPrice;

    public AsusPC(int price) {
        this.pcPrice = price;
    }

    @Override
    public void ShowPCBrand() {
        System.out.println("This is a Asus PC!");
    }

    @Override
    public void ShowPCPrice() {
        if (this.pcPrice >= 0) {
            System.out.println("This Asus PC's price is " + this.pcPrice);
        } else {
            System.out.println("No price for this Asus PC!");
        }
    }
}
