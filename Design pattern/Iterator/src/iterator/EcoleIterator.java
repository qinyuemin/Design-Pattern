/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.*;

public class EcoleIterator implements Iterator {

    private int currentIndex;
    private Vector vector;

    public EcoleIterator(Vector v) {
        this.vector = v;
        this.currentIndex = 0;
    }

    @Override
    public Object GetNextItem() {
        this.currentIndex++;
        return this.vector.get(currentIndex);
    }

    @Override
    public Object GetCurrentItem() {
        return this.vector.get(currentIndex);
    }

    @Override
    public boolean HasNext() {
        if (currentIndex >= this.vector.size() - 1) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object GetFirstItem() {
        this.currentIndex = 0;
        return this.vector.get(currentIndex);
    }
}
