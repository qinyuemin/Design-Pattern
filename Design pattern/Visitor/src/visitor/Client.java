/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

public class Client {
    
    public static void main(String[] args) {
        Visitor visiter = new PCVisitor("Daniel");
        Magazin magazin = new PCMagazin("BestBuy");
        magazin.accept(visiter);
    }
}
