/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototye;
/**
 *
 * @author Daniel
 */
public class LenovoPrototype implements PCPrototype{

    public String name;
    
    @Override
    public void ShowPCName() {
        System.out.println("I'm a Lenovo PC and my name is "+name);
    }

    @Override
    public Object clone() {
        Object pc = null;
        try {
            pc = super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Not support clone");
        }
        return pc;
    }

    @Override
    public void SetPCName(String name) {
        this.name=name;
    }
}
