/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

public class Client {

    public static void main(String[] args) {
        PC lenovo1 = new LenovoPC(new IntelCPU());
        PC lenovo2 = new LenovoPC(new AMDCPU());
        lenovo1.ShowCPUName();
        lenovo1.ShowPCName();
        lenovo2.ShowCPUName();
        lenovo2.ShowPCName();
    }
}
