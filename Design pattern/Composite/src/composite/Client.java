/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

public class Client {
    
    public static void main(String[] args) {
        PC pc = new LenovoPC();
        PC cpu = new CPU();
        PC motherBoard = new MotherBoard();
        pc.add(cpu);
        pc.add(motherBoard);
        pc.add(pc);
        pc.display();
        pc.remove(cpu);
        pc.display();
    }
}
