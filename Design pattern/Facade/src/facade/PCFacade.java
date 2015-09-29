/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.io.*;
import java.util.*;

public class PCFacade {

    private CPU cpu;
    private MotherBoard motherboard;

    public PCFacade() {
        this.cpu = null;
        this.motherboard = null;
    }

    public PCFacade(String cpuBrand, String motherBoardBrand, int cpuPrice, int motherBoardPrice) {
        this.cpu = new CPU(cpuBrand, cpuPrice);
        this.motherboard = new MotherBoard(motherBoardBrand, motherBoardPrice);
    }

    public void ShowPCInformation() {
        if (this.cpu != null && this.motherboard != null) {
            System.out.println("The cpu information is below: ");
            this.cpu.ShowCPUInfo();
            System.out.println("The motherboard information is below: ");
            this.motherboard.ShowMotherBoardInfo();
        } else {
            System.out.println("There is no PC information!");
        }
    }
}
