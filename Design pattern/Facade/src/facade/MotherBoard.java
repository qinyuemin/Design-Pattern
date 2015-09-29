/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.io.*;

public class MotherBoard {

    private String brand;
    private int price;

    public MotherBoard(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public MotherBoard() {
        this.brand = null;
        this.price = 0;
    }

    public void ShowMotherBoardInfo() {
        if (this.brand != null) {
            System.out.println("This is a " + this.brand + " motherboard and its price is " + this.price + "!");
        } else {
            System.out.println("No info imation of the motherboard!");
        }
    }
}
