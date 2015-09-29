/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.*;

public class LenovoPC extends PC {

    private Set arbre;

    public LenovoPC() {
        this.partName = "Lenovo PC";
        arbre = new HashSet();
    }

    @Override
    public void add(PC part) {
        //throw new UnsupportedOperationException("Not supported yet.");
        if (arbre.add(part)) {
            System.out.println("The " + part.partName + " is added into the container!");
        } else {
            System.out.println("The " + part.partName + " is not added into the container!");
        }
    }

    @Override
    public void remove(PC part) {
        //throw new UnsupportedOperationException("Not supported yet.");
        Iterator it = arbre.iterator();
        int t = 0;
        for (; it.hasNext();) {
            if (it.next() == part) {
                it.remove();
                t++;
            }
        }
        if (t != 0) {
            System.out.println("The " + part.partName + " is removed!");
        } else {
            System.out.println("There is no " + part.partName);
        }
    }

    @Override
    public void display() {
        //throw new UnsupportedOperationException("Not supported yet.");
        Iterator it = arbre.iterator();
        for (; it.hasNext();) {
            PC temp = (PC) it.next();
            System.out.print("There is a " + temp.partName + ".  ");
        }
        System.out.println();
    }
}
