package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    List<Comanda> listaComenzi = new ArrayList<>();

    public void inregistreazaComenzi(Comanda comanda){
        listaComenzi.add(comanda);
    }

    public void executaComanda(){
        if(this.listaComenzi.size() > 0) {
            this.listaComenzi.getFirst().executa();
            this.listaComenzi.remove(0);
        }
    }
}
