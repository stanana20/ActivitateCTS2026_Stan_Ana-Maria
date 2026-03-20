package cts.ase.ro.prototype.main;

import cts.ase.ro.prototype.clase.Rezervare;
import cts.ase.ro.prototype.clase.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        //NU RESPECTA DPI
//        Rezervare rezervare1 = new Rezervare("Ionescu", 20, 6, "0720123456");
//        Rezervare rezervare2 =(Rezervare) rezervare1.clone();
//
//        rezervare2.setOraRezervare(12);
//        rezervare2.setZiuaRezervarii(10);

        //RESPECTA DPI
        RezervareAbstracta rezervare1 = new Rezervare("Ionescu", 20, 6, "0720123456");
        RezervareAbstracta rezervare2 =(Rezervare) rezervare1.clone();

        ((Rezervare)rezervare2).setOraRezervare(12);
        ((Rezervare)rezervare2).setZiuaRezervarii(10);

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}
