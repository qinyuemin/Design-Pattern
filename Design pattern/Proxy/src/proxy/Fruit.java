/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author Daniel
 */
public abstract class Fruit {

    protected String fruitName;
    protected int price;

    public Fruit(String name, int price) {
        this.fruitName = name;
        this.price = price;
    }

    public Fruit() {
        this.fruitName = null;
        this.price = 0;
    }

    protected abstract void ShowFruitInfo();
}
