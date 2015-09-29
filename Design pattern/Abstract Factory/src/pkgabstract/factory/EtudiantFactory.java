package pkgabstract.factory;

import java.util.*;
import java.io.*;
import java.lang.*;

/*
Concret factory 
 */
public class EtudiantFactory implements EcoleFactory {

    @Override
    public Homme CreateHommeFactory() {
        return new Etudiant();
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Cours CreateCoursFactory() {
        return null;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Homme> CreatEtudiantList(int number) {
        List<Homme> list=new ArrayList<Homme>();
        for (int i = 0; i < number; i++) {
            list.add(i, new Etudiant());
        }
        return list;
    }
}
