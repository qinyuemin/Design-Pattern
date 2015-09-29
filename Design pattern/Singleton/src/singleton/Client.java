/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Client {

    public static void main(String[] args) {
        PCSingleton PC = PCSingleton.getInstance();
        PCSingleton LenovoPC = PCSingleton.getInstance();
        if (PC == LenovoPC) {
            System.out.println("The two instances are same");
        } else {
            System.out.println("The two instances are not same");
        }
        LenovoPC.SetBrand("Lenovo");
        LenovoPC.SetPrice(8000);
        LenovoPC.ShowBrand();
        LenovoPC.ShowPrice();
    }
}
