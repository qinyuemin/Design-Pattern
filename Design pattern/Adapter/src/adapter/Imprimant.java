/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Imprimant {

    public String brand;

    public Imprimant() {
        this.brand = null;
    }

    public Imprimant(String brand) {
        this.brand = brand;
    }

    public void print(String context) {
        System.out.println("I'm printing " + context);
    }

    public void showBrand() {
        System.out.println("My brand is " + this.brand);
    }
}
