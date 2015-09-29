/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

public class Client {
    
    public static void main(String[] args) {
        Mediator mediator = new PCMediator();
        Colleague client = new PCClient(mediator, "Daniel");
        Colleague produceur = new PCProduceur(mediator, "Lenovo", "Intel");
        System.out.println("Test 1!");
        client.action();
        produceur.action();
        System.out.println("Test 2!");
        mediator.setColleague(client);
        mediator.setColleague(produceur);
        client.action();
        produceur.action();
    }
}
