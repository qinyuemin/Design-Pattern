/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author Daniel
 */
public class Client {

    public static void main(String[] args) {
        Fruit banana = new Banana(100);
        Fruit fruit = new FruitProxy(banana);
        fruit.ShowFruitInfo();
    }
}
