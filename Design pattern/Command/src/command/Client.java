/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

public class Client {

    public static void main(String[] args) {
        Patron boss = new Patron();
        Ouvrier worker = new Ouvrier("Daniel");
        Command startcommand = new StartWorkCommand(worker);
        Command stopcommand = new StopWorkCommand(worker);
        boss.setCommand(startcommand);
        boss.startCommand();
        boss.setCommand(stopcommand);
        boss.startCommand();
    }
}
