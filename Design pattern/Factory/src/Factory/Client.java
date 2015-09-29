/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
import java.util.*;
/**
 *
 * @author Daniel
 */
public class Client {

    public static void main(String[] args) {
        CPUFactory intelfactory=new IntelCPUFactory();
        CPUFactory amdfactory=new AMDCPUFactory();
        CPU intelcpu=intelfactory.creatCPU();
        CPU amdcpu=amdfactory.creatCPU();
        intelcpu.ShowName();
        amdcpu.ShowName();
    }
}
