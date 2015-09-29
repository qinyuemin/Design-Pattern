/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
import java.io.*;
/**
 *
 * @author Daniel
 */
public class AMDCPU implements CPU{

    @Override
    public void ShowName() {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("AMD CPU est bien cree");
    }
    
}
