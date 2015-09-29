/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

public class Memento {

    private int bookNumber;
    private int bookBroken;
    private int bookRent;

    public Memento(int number, int broken, int rent) {
        this.bookNumber = number;
        this.bookBroken = broken;
        this.bookRent = rent;
    }

    public int getBookBroken() {
        return bookBroken;
    }

    public void setBookBroken(int bookBroken) {
        this.bookBroken = bookBroken;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public int getBookRent() {
        return bookRent;
    }

    public void setBookRent(int bookRent) {
        this.bookRent = bookRent;
    }
}
