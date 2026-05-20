package Facade.clase;

public class Facade {
    public void verificareClient(Client client) {
        VerificareVarsta verificareVarsta = new VerificareVarsta();
        if(verificareVarsta.areVarstaNecesara(client)){
            System.out.println("Clientul are varsta potrivita!");
        }else{
            System.out.println("Clientul nu are varsta necesara!");
        }

        VerificarePolitie verificarePolitie = new VerificarePolitie();
        verificarePolitie.verificare(client);

        VerificareCreante verificareCreante = new VerificareCreante();
        verificareCreante.verifica(client);
    }
}
