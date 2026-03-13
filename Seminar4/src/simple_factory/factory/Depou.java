package simple_factory.factory;

import simple_factory.clase.Autobuz;
import simple_factory.clase.MijlocTransport;
import simple_factory.clase.Tramvai;
import simple_factory.clase.Troleibuz;

public class Depou {
    public MijlocTransport getMijlocTransport(Tip tip, int nrRoti, String nrInmatriculare) {
        if(tip == Tip.AUTOBUZ){
            return new Autobuz(nrRoti, nrInmatriculare);
        }
        if (tip == Tip.TRAMVAI) {
            return new Tramvai(nrRoti, nrInmatriculare);
        }
        if(tip==Tip.TROLEIBUZ) {
            return new Troleibuz(nrRoti, nrInmatriculare);
        }
        return null;
    }
}
