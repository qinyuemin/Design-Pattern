/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

public class Surveillant extends Observer {

    private int cpuTemperatue;
    private Ordinateur pc;

    public Surveillant(Machine m, String name) {
        super(m, name);
        this.pc = (Ordinateur) m;
        m.attach(this);
    }

    @Override
    public void update() {
        this.cpuTemperatue = pc.getCPUTemperature();
        System.out.println("Observer " + this.ObvName + " dectects the actual temperature is " + this.cpuTemperatue);
    }
}
