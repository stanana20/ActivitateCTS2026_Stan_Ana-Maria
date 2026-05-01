package proxy;

import clase.MijlocTransport;
import clase.Statie;
import clase.TipCursa;

public class AutobuzDeNoapte implements MijlocTransport {
    private MijlocTransport mijlocTransport;

    public AutobuzDeNoapte(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if (this.mijlocTransport.getNrPasageri() > 0 || statie.getNrCalatori() > 0) {
            this.mijlocTransport.opresteInStatie(statie);
        } else {
            System.out.println("Autobuzul nu opreste in statia " + statie.getNume() + "!");
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
