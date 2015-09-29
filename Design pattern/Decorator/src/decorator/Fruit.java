/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.io.*;

public abstract class Fruit {

    protected String name;

    public void ShowName() {
        System.out.println("I'm a " + name + ".");
    }
}
