package ma.elom.pres;

import ma.elom.dao.IDao;
import ma.elom.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import static java.lang.Class.forName;

public class Pres2 {
//    FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException
    public static void main(String[] args) throws Exception  {
        Scanner sc = new Scanner(new File("config.txt"));

        String daoClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao= (IDao) cDao.newInstance();

        String metierClassName = sc.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println("RES="+metier.calcul());
    }
}
