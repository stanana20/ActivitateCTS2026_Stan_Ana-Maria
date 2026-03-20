package cts.ase.ro.factory_method.main;

import cts.ase.ro.factory_method.clase.FelMancare;
import cts.ase.ro.factory_method.clase.SupaCiuperci;
import cts.ase.ro.factory_method.enums.TipDesert;
import cts.ase.ro.factory_method.enums.TipMancare;
import cts.ase.ro.factory_method.enums.TipSupa;
import cts.ase.ro.factory_method.fabrici.FabricaDesert;
import cts.ase.ro.factory_method.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaDesert fabricaDesert =  new FabricaDesert();
        FabricaSupa fabricaSupa =  new FabricaSupa();

        FelMancare supaCiuperci= fabricaSupa.getFelMancare(TipSupa.CIUPERCI, 15, 300);
        FelMancare supaLegume= fabricaSupa.getFelMancare(TipSupa.LEGUME, 20,320);

        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI, 30, 200, 500);
        FelMancare cheesecake = fabricaDesert.getFelMancare(TipDesert.CHEESECAKE, 35, 250, 450);

       supaLegume.afisare();
       supaCiuperci.afisare();
       papanasi.afisare();
       cheesecake.afisare();
    }
}
