/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Daniel
 */
public class Client {

    public static void main(String[] args) {
        PCBuilder builder=new LenovoBuilder();
        PCDesigner designer=new PCDesigner(builder);
        designer.Design();
        builder.GetPC();
    }
}
