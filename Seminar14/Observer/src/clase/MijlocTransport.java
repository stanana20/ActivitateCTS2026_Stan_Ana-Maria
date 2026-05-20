package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport {
    protected String linie;
    protected List<Calator> calatori;

    public MijlocTransport(String linie) {
        this.linie = linie;
        this.calatori = new ArrayList<>();
    }

    public void trimiteMesaj(String mesaj) {
        for(Calator c: this.calatori){
            c.receptioneazaMesaj(mesaj);
        }
    }

    public void aboneazaCalator(Calator calator){
        this.calatori.add(calator);
    }

    public void dezaboneazaCalator(Calator calator){
        this.calatori.remove(calator);
    }
    public abstract void pleacaDinDepou();
    public abstract void ramaneBlocatInTrafic();
}
