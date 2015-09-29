/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Adapter extends Imprimant {

    private Stylo stylo;

    public Adapter(Stylo pen) {
        this.stylo = pen;
    }

    public Adapter(String brand) {
        this.brand = brand;
        stylo = null;
    }

    @Override
    public void print(String context) {
        if (stylo != null) {
            stylo.write(context);
        } else {
            super.print(context);
        }
    }

    @Override
    public void showBrand() {
        if (stylo != null) {
            stylo.showColor();
        } else {
            super.showBrand();
        }
    }
}
