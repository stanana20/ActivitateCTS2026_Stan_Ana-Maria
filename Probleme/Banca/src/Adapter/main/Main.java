package Adapter.main;

import Adapter.clase.BancaAdaptataObiecte;
import Adapter.clase.CreditLeasing;
import Adapter.clase.IBanca;
import Adapter.clase.ICreditLeasing;

public class Main {
    public static void main(String[] args) {
        ICreditLeasing credit = new CreditLeasing(250000.23);
        IBanca bancaObj = new BancaAdaptataObiecte(credit);
        bancaObj.acordaCredit();

        IBanca bancaCls = new BancaAdaptataObiecte(credit);
        bancaCls.acordaCredit();
    }
}
