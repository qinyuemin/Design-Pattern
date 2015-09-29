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
public class MotherBoard {

    public String name;

    public MotherBoard(String name) {
        this.name = name;
    }

    public void ShowName() {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("Je suis " + this.name + " MotherBoard.");
    }
}
