/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.*;
import java.io.*;
import java.lang.*;

/**
 *
 * @author Daniel
 */
public class PCSingleton {

    private String name;
    private int price;
    private final static PCSingleton pc = new PCSingleton(); //final 关键字为必须用以确保只有一个实例

    //构造函数为private，此为关键
    private PCSingleton() {
        this.name = null;
        this.price = -1;
    }

    public void ShowBrand() {
        if (name != null) {
            System.out.println("The pc brand is " + this.name);
        } else {
            System.out.println("The pc brand is not set");
        }

    }

    public void ShowPrice() {
        if (price >= 0) {
            System.out.println("The pc price is " + this.price);
        } else {
            System.out.println("The pc price is not set");
        }
    }

    public void SetBrand(String name) {
        this.name = name;
    }

    public void SetPrice(int price) {
        this.price = price;
    }

    //在static 方法中不能为飞static 方法赋值
    public static PCSingleton getInstance() {
        return pc;
    }
}
