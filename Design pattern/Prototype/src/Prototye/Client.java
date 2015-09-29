package Prototye;
import java.util.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author Daniel
 */
public class Client {

    public static void main(String[] args) {
        PCPrototype pc1=new LenovoPrototype();
        pc1.SetPCName("Daniel pc1");
        pc1.ShowPCName();
        PCPrototype pc2=(PCPrototype) pc1.clone();
        pc2.SetPCName("Daniel pc2");
        pc2.ShowPCName();
    }
}
