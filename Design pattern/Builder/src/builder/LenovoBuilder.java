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
public class LenovoBuilder implements PCBuilder {

    public PC pc;
    public CPU cpu;
    public MotherBoard motherboard;

    public LenovoBuilder() {
        pc = null;
        cpu = null;
        motherboard = null;
    }

    @Override
    public void CreatCPU() {
        //throw new UnsupportedOperationException("Not supported yet.");
        cpu = new CPU("Intel");
    }

    @Override
    public void CreatMotherBoard() {
        //throw new UnsupportedOperationException("Not supported yet.");
        motherboard = new MotherBoard("Asus");
    }

    @Override
    public PC GetPC() {
        //throw new UnsupportedOperationException("Not supported yet.");
        if (cpu.name != null && motherboard.name != null) {
            pc = new PC("Lenovo");
            cpu.ShowName();
            motherboard.ShowName();
            pc.ShowName();
            return pc;
        } else {
            return null;
        }
    }
}
