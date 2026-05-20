package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Spalatorie implements ISpalatorie {
    private String nume;
    private List<IClient> clienti = new ArrayList<>();

    public Spalatorie(String nume) {
        this.nume = nume;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(IClient client: clienti){
            client.receptioneazaMesajul(mesaj);
        }
    }

    @Override
    public void adaugaClient(IClient client) {
        this.clienti.add(client);
    }

    @Override
    public void stergeClient(IClient client) {
        this.clienti.remove(client);
    }

    public void eliberareSlot(){
        trimiteMesaj("S-a eliberat un slot!");
    }

    public void instiintareNrPersoaneInAsteptare(){
        trimiteMesaj("Sunt "+this.clienti.size()+" clienti in asteptare!");
    }
}
