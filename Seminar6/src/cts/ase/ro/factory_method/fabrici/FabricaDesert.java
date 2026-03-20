package cts.ase.ro.factory_method.fabrici;

import cts.ase.ro.factory_method.clase.Cheesecake;
import cts.ase.ro.factory_method.clase.FelMancare;
import cts.ase.ro.factory_method.clase.Papanasi;
import cts.ase.ro.factory_method.enums.TipDesert;
import cts.ase.ro.factory_method.enums.TipMancare;

public class FabricaDesert implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        return getFelMancare(tipMancare, pret, gramaj, 500);
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        if(tipMancare == TipDesert.PAPANASI){
            return new Papanasi(pret, gramaj, calorii);
        } else if (tipMancare==TipDesert.CHEESECAKE) {
            return new Cheesecake(pret, gramaj, calorii);
        }
        return null;
    }
}
