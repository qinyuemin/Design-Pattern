/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.util.*;
import java.io.*;
import java.lang.*;

public class LenovoPC extends PC {

    public String location;

    public LenovoPC(CPU cpu) {
        super(cpu);
        this.PCName = "Lenovo";
        this.location = "China";
    }

    public void ShowLocation() {
        System.out.println("This PC is made in " + location);
    }
}
