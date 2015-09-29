/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

public class Client {

    public static void main(String[] args) {
        PCFacade pc = new PCFacade("Intel", "ASUS", 1000, 800);
        pc.ShowPCInformation();
    }
}
