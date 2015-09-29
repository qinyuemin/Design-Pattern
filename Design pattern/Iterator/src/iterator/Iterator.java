/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

public interface Iterator {
    public Object GetNextItem();
    public Object GetCurrentItem();
    public boolean HasNext();
    public Object GetFirstItem();
}
