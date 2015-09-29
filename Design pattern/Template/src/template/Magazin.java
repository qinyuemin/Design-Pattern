/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

public abstract class Magazin {

    protected String magazinName;
    protected int productAmount;

    public Magazin(String name) {
        this.magazinName = name;
    }

    /*
    此处有final为关键！
     */
    public final void ShowMagazinInfo() {
        this.ShowMagazinName();
        this.ShowMagazinType();
        this.HasProducts();
        this.Hook();
    }

    protected void ShowMagazinName() {
        System.out.println("This is " + this.magazinName);
    }

    protected abstract void ShowMagazinType();

    protected void HasProducts() {
        if (this.productAmount <= 0) {
            System.out.println("No products in magazin!");
        } else {
            System.out.println("There are " + this.productAmount);
        }
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    protected void Hook() {
        System.out.println("Do nothing!");
    }
}
