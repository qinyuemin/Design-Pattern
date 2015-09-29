/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

public abstract class FruitDecorate extends Fruit {

    protected Fruit fruit;
    protected int price;

    public FruitDecorate(Fruit f, int price) {
        fruit = f;
        this.name = f.name;
        this.price = price;
    }

    public FruitDecorate() {
        fruit = null;
        price = 0;
    }

    @Override
    public void ShowName() {
        System.out.println("I'm a" + name);
        this.ShowPrice();
    }

    public void ShowPrice() {
        System.out.println("My price is " + price);
    }
}
