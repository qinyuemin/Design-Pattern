/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

public class Client {
    
    public static void main(String[] args) {
        Magazin daniel = new Magazin(100);
        for (int i = 0; i < 10; i++) {
            daniel.buy(10+i);
        }
    }
}
