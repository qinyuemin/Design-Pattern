/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.io.*;

public class CPU {

    private String brand;
    private int price;

    public CPU(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public CPU() {
        this.brand = null;
        this.price = 0;
    }

    public void ShowCPUInfo() {
        if (this.brand != null) {
            System.out.println("This is a " + this.brand + " cpu and its price is " + this.price + "!");
        } else {
            System.out.println("No info imation of the cpu!");
        }
    }
}
