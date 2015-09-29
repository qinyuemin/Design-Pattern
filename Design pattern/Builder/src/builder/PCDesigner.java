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
public class PCDesigner {

    public PCBuilder builder;

    public PCDesigner(PCBuilder builder) {
        this.builder = builder;
    }

    public void Design() {
        builder.CreatCPU();
        builder.CreatMotherBoard();
    }
}
