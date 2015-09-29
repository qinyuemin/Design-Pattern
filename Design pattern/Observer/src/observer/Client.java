/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

public class Client {
    
    public static void main(String[] args) {
        Ordinateur pc = new Ordinateur();
        Observer obv1 = new Surveillant(pc, "Yuemin");
        Observer obv2 = new Surveillant(pc, "Zhousheng");
        System.out.println("First set!");
        pc.setCPUTemperature(100);
        System.out.println("Seconcd set!");
        pc.setCPUTemperature(50);
    }
}
