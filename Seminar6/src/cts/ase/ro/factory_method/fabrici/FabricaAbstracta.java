package cts.ase.ro.factory_method.fabrici;

import cts.ase.ro.factory_method.clase.FelMancare;
import cts.ase.ro.factory_method.enums.TipMancare;

public interface FabricaAbstracta {
    public FelMancare getFelMancare(TipMancare tipMancare,float pret, float gramaj);
    public FelMancare getFelMancare(TipMancare tipMancare,float pret, float gramaj, int calorii);
}