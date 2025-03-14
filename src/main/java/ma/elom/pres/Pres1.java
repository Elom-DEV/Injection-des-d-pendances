package ma.elom.pres;

import ma.elom.dao.DaoImpl;

import ma.elom.ext.DaoImplV2;
import ma.elom.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
//        metier.setDao(d); //via le  setters
        System.out.println("Res="+metier.calcul());
    }
}
