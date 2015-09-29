/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/*
 * 说明了创建一个子类的对象实例的时候，必先调用父类的无参数的构造函数（默认构造函数），
 * 假如父类有带参数的构造函数，那么系统将不会给它创建无参数的构造函数，这时，子类在实例化的时候，因为找不到父类的默认构造函数，编译器将会报错，
 * 但如果在子类的构造函数中指定用父类的带参数的构造函数的时候，或者在父类中加一个无参数的构造函数，就不会报错
 */

public class Apple extends FruitDecorate {

    public Apple(Fruit fruit, int price) {
        super(fruit, price);
    }

    @Override
    public void ShowName() {
        System.out.println("I'm a very cool " + name+" with an apple");
        this.ShowPrice();
    }

    @Override
    public void ShowPrice() {
        System.out.println("So my price is " + price);
    }
}
