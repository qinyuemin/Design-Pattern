/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;
import java.util.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author Daniel
 */
public class PC {

    public String name;

    public PC(String name) {
        this.name = name;
    }

    public void ShowName() {
        System.out.println("Je suis " + this.name + " PC. :-)");
    }
}
