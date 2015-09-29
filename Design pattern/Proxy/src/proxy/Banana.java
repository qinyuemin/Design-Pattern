/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author Daniel
 */
public class Banana extends Fruit {

    public Banana(int price) {
        super("Banana", price);
    }
    
    @Override
    protected void ShowFruitInfo() {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("This is a " + this.fruitName);
        System.out.println("My price is " + this.price);
    }
}
