package pkgabstract.factory;

import java.util.*;
import java.io.*;
import java.lang.*;
/*
    Concret factory 
*/
public class LogicielCoursFactory implements EcoleFactory{
    
    @Override
    public Homme CreateHommeFactory() {
        return null;
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Cours CreateCoursFactory() {
        return new LogicielCours();
        //throw new UnsupportedOperationException("Not supported yet.");
    }  
    
    public List<Cours> CrestCoursList(int number)
    {
        List<Cours> list=new ArrayList<Cours>();
        for(int i=0;i<number;i++)
        {
            list.add(i, new LogicielCours());
        }
        return list;
    }
}
