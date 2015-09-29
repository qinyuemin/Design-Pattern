/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

public class Client {
    
    public static void main(String[] args) {
        Stylo stylo = new Stylo("White");
        Imprimant printer = new Adapter("Canon");
        Imprimant adapter = new Adapter(stylo);
        stylo.showColor();
        stylo.write("My instance is Stylo");
        printer.showBrand();
        printer.print("My instance is Imprimant");
        adapter.showBrand();
        adapter.print("I'm stylo,but I'm using adapter");
    }
}
