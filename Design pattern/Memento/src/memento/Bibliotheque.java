/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

public class Bibliotheque {

    private int bookNumber;
    private int bookBroken;
    private int bookRent;

    public Bibliotheque() {
        this.bookBroken = 0;
        this.bookNumber = 0;
        this.bookRent = 0;
    }

    public Bibliotheque(int number, int broken, int rent) {
        this.bookNumber = number;
        this.bookBroken = broken;
        this.bookRent = rent;
    }

    public Memento creatMemo() {
        return new Memento(bookNumber, bookBroken, bookRent);
    }

    public void setMemoData(Memento memo) {
        this.bookNumber = memo.getBookNumber();
        this.bookBroken = memo.getBookBroken();
        this.bookRent = memo.getBookRent();
    }

    public void showData() {
        System.out.println("There are " + this.bookNumber + " in this bibliotheque!");
        System.out.println(this.bookBroken + " books are broken!");
        System.out.println(this.bookRent + " books are rent!");
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
