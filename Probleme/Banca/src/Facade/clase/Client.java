package Facade.clase;

public class Client {
    private int varsta;
    private String nume;

    public Client(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }
}
