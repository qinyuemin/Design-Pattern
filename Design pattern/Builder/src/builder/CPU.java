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
public class CPU {

    public String name;

    public CPU(String name) {
        this.name = name;
    }

    public void ShowName() {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("Je suis " + this.name + " CPU.");
    }
}
