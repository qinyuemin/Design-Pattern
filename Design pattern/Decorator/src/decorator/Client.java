/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

public class Client {

    public static void main(String[] args) {
        Fruit fruit = new Banana();
        fruit.ShowName();
        fruit = new Apple(new Banana(), 100);
        fruit.ShowName();
    }
}
