package Facade.clase;

public class VerificarePolitie {
    public boolean verificare(Client client){
        return client.getNume().length()<5;
    }
}
