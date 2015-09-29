package Prototye;
import java.util.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author Daniel
 */
public interface PCPrototype extends Cloneable{
    public void ShowPCName();
    public void SetPCName(String name);
    public Object clone();
}
