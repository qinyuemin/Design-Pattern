/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.util.*;
import java.io.*;
import java.lang.*;

public abstract class CPU {

    protected String cpuName;

    public CPU(String name) {
        this.cpuName = name;
    }

    public CPU() {
        this.cpuName = null;
    }

    public void ShowCPUName() {
        if (cpuName != null) {
            System.out.println("This PC's cpu is " + cpuName);
        } else {
            System.out.println("NO cpu name!");
        }
    }
}
