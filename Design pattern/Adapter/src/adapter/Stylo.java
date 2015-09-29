/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Stylo {

    public String color;

    public Stylo(String color) {
        this.color = color;
    }

    public void write(String context) {
        System.out.println("I'm writing " + context);
    }

    public void showColor() {
        System.out.println("My color is " + this.color);
    }
}
