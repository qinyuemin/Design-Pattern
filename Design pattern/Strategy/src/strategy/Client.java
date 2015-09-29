/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

public class Client {

    public static void main(String[] args) {
        PC lenovoPC = new LenovoPC(6000);
        PC AsusPC = new AsusPC(5000);
        Magazin Daniel = new Magazin(lenovoPC);
        Daniel.ShowPCInfo();
        Daniel = new Magazin(AsusPC);
        Daniel.ShowPCInfo();
    }
}
