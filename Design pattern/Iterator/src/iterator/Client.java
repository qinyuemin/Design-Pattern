/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

public class Client {

    public static void main(String[] args) {
        Etudiant student1 = new Etudiant("Daniel");
        Etudiant student2 = new Etudiant("QIN Yuemin");
        Etudiant student3 = new Etudiant("Zhou Sheng");
        Ecole utt = new UTT();
        utt.addEtudiant(student1);
        utt.addEtudiant(student2);
        utt.addEtudiant(student3);
        Iterator iterator = utt.createIterator();
        System.out.println("Le premier tour!");
        Etudiant temp = null;
        temp = (Etudiant) iterator.GetFirstItem();
        temp.ShowName();
        for (; iterator.HasNext();) {
            temp = (Etudiant) iterator.GetNextItem();
            temp.ShowName();
        }
        utt.countEtudiant();
        System.out.println("Le deuxiem tour!");
        utt.removeEtudiant(student3);
        temp = (Etudiant) iterator.GetFirstItem();
        temp.ShowName();
        for (; iterator.HasNext();) {
            temp = (Etudiant) iterator.GetNextItem();
            temp.ShowName();
        }
        utt.countEtudiant();
    }
}
