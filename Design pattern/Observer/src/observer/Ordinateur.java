/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.*;

public class Ordinateur extends Machine {

    private int CPUTemperature;

    public Ordinateur() {
        this.machineName = "Daniel-PC";
        this.CPUTemperature = 0;
    }

    public int getCPUTemperature() {
        return CPUTemperature;
    }

    public void setCPUTemperature(int CPUTemperature) {
        this.CPUTemperature = CPUTemperature;
        this.annonce();
    }

    @Override
    public void attach(Observer obv) {
        this.observers.add(obv);
        System.out.println("The observer " + obv.getObvName() + " is added");
    }

    @Override
    public void detach(Observer obv) {
        if (this.observers.remove(obv)) {
            System.out.println("The observer " + obv.getObvName() + " is removed");
        } else {
            System.out.println("There is no observer " + obv.getObvName());
        }
    }

    @Override
    public void annonce() {
        Iterator it = this.observers.iterator();
        for (; it.hasNext();) {
            Observer o = (Observer) it.next();
            o.update();
        }
    }
}
    /*
     * Collection是最基本的集合接口，一个Collection代表一组Object，即Collection的元素（Elements）。
     * 一些Collection允许相同的元素而另一些不行。一些能排序而另一些不行。
     * 
     * List是有序的Collection,提到的Set不同，List允许有相同的元素
     * ArrayList实现了可变大小的数组
     * Vector非常类似ArrayList，但是Vector是同步的。
     * 
     * Set是一种不包含重复的元素的Collection
     * 
     * Map没有继承Collection接口，Map提供key到value的映射。
     * Hashtable继承Map接口，实现一个key-value映射的哈希表。任何非空（non-null）的对象都可作为key或者value。 
     * HashMap和Hashtable类似，不同之处在于HashMap是非同步的，并且允许null，即null value和null key。
     */