/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Daniel
 */
public class AMDCPUFactory implements CPUFactory{

    @Override
    public CPU creatCPU() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return new AMDCPU();
    }
    
}
