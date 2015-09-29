/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

public class PCVisitor implements Visitor {

    private String name;

    public PCVisitor(String name) {
        this.name = name;
    }

    @Override
    public void visite(Magazin m) {
        this.ShowVisiterName();
    }

    public void ShowVisiterName() {
        System.out.println("M./Mme " + name + " veut acheter un PC!");
    }
}
