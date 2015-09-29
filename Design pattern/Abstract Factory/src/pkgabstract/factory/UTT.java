/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.factory;

/**
 *
 * @author Daniel
 */
public class UTT {

    public static void main(String[] args) {
        EcoleFactory etudiant=new EtudiantFactory();
        EcoleFactory cours=new LogicielCoursFactory();
        
        Homme Daniel=etudiant.CreateHommeFactory();
        Daniel.setNom("Daniel");
        Daniel.ShowNom();
        
        Cours LO09=cours.CreateCoursFactory();
        LO09.setNom("LO09");
        LO09.ShowCourNom();
    }
}
