package Proxy.clase;

public class Credit implements ICredit{
    private String valuta;

    public Credit(String valuta) {
        this.valuta = valuta;
    }

    public String getValuta() {
        return valuta;
    }

    @Override
    public void realizareCredit() {
        System.out.println("S-a realizat un credit!");
    }
}
