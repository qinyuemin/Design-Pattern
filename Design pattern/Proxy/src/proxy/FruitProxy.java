/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author Daniel
 */
public class FruitProxy extends Fruit {

    private Fruit fruit;
    /*
     * Java在实例化一个对象的时候，如果没有显式使用super()，则会先调用父类的无参构造函数(不是和自己构造函数参数数量对应的那个)
     * 然后调用子类的构造函数
     */

    public FruitProxy(Fruit fruit) {
        super(fruit.fruitName, fruit.price);
        this.fruit = fruit;
    }

    public FruitProxy() {
        super();
        this.fruit = null;
    }

    /*
     * 重写是，子类的关键字要比父类宽松。但如果父类是private，则子类不能继承。     
     */
    @Override
    public void ShowFruitInfo() {
        //throw new UnsupportedOperationException("Not supported yet.");
        if (this.fruit != null) {
            fruit.ShowFruitInfo();
        } else {
            System.out.println("There is no fruit information!");
        }
    }
}
