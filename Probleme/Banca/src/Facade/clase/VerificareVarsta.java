package Facade.clase;

public class VerificareVarsta {
    public boolean areVarstaNecesara(Client client){
       return client.getVarsta()>18;
    }
}
