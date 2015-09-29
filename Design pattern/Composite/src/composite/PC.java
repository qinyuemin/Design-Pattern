/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.*;
import java.io.*;
import java.lang.*;

public abstract class PC {

    public String partName;

    public PC() {
        this.partName = null;
    }

    public abstract void add(PC part);

    public abstract void remove(PC part);

    public abstract void display();

    public void showName() {
        if (this.partName != null) {
            System.out.println("This is a " + this.partName);
        } else {
            System.out.println("There is nothing");
        }
    }
}
