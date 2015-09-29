/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

public class Client {

    public static void main(String[] args) {
        System.out.println("L'etat initialise de bibliotheque");
        Bibliotheque lib = new Bibliotheque(1000, 10, 100);
        lib.showData();
        System.out.println("Sauvegardez cet etat!");
        Memento memo = lib.creatMemo();
        Caretaker taker = new Caretaker(memo);
        System.out.println("L'etat est change!");
        lib.setBookBroken(20);
        lib.setBookRent(200);
        System.out.println("Montez l'etat actuel!");
        lib.showData();
        System.out.println("Restaurez l'etat de memo!");
        lib.setMemoData(memo);
        System.out.println("Montez l'etat eventuel!");
        lib.showData();
    }
}
