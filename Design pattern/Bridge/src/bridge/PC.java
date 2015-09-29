/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.util.*;
import java.io.*;
import java.lang.*;

/**
 *
 * @author Daniel
 */
public abstract class PC {

    protected CPU cpu;
    protected String PCName;

    public PC(CPU cpu) {
        this.cpu = cpu;
        this.PCName = null;
    }

    public void ShowPCName() {
        if (PCName != null) {
            System.out.println("This is a " + PCName + " PC");
        } else {
            System.out.println("No PC name!");
        }
    }

    public void ShowCPUName() {
        cpu.ShowCPUName();
    }
}
