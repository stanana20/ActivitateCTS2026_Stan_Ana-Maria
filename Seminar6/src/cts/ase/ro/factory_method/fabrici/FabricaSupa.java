package cts.ase.ro.factory_method.fabrici;

import cts.ase.ro.factory_method.clase.FelMancare;
import cts.ase.ro.factory_method.clase.Supa;
import cts.ase.ro.factory_method.clase.SupaCiuperci;
import cts.ase.ro.factory_method.clase.SupaLegume;
import cts.ase.ro.factory_method.enums.TipMancare;
import cts.ase.ro.factory_method.enums.TipSupa;

public class FabricaSupa implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
       if(tipMancare == TipSupa.LEGUME){
           return new SupaLegume(pret, gramaj);
       } else if (tipMancare == TipSupa.CIUPERCI) {
           return new SupaCiuperci(pret, gramaj);
       }
       return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        return getFelMancare(tipMancare, pret, gramaj);
    }
}
