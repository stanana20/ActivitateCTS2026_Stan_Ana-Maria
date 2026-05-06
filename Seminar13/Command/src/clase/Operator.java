package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(Comanda comanda){ //invocare
        this.comenzi.add(comanda);
    }

    public void executaComanda(){
        if(this.comenzi.size()>0){
            this.comenzi.get(0).pleacaInCursa();
            this.comenzi.remove(0);
        }
    }
}
