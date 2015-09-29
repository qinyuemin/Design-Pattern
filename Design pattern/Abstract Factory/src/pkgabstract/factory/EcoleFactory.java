package pkgabstract.factory;

import java.util.*;
import java.io.*;
import java.lang.*;

/*
 * Abstract factory
*/
public interface EcoleFactory {
    public Homme CreateHommeFactory();
    public Cours CreateCoursFactory();
}
