package proxy;

import clase.MijlocTransport;
import clase.Statie;
import clase.TipCursa;

public class AutobuzCursaSpeciala implements MijlocTransport {
    private MijlocTransport mijlocTransport;

    public AutobuzCursaSpeciala(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if (this.mijlocTransport.getCursa() == TipCursa.CURSA_SPECIALA) {
            System.out.println("Autobuzul este intr-o cursa speciala, nu opreste in statiile STB!");
        } else {
            this.mijlocTransport.opresteInStatie(statie);
        }
    }

    @Override
    public int getNrPasageri() {
        return this.mijlocTransport.getNrPasageri();
    }

    @Override
    public TipCursa getCursa() {
        return this.mijlocTransport.getCursa();
    }
}
