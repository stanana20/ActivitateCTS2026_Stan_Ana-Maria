package Facade.clase;

public class VerificareCreante {
    public boolean verifica(Client client){
        return client.getVarsta()>30;
    }
}
