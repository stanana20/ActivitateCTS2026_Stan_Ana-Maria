package Proxy.clase;

public class Client {
    private String nume;
    private boolean areAbonament;

    public Client(String nume, boolean areAbonament) {
        this.nume = nume;
        this.areAbonament = areAbonament;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreAbonament() {
        return areAbonament;
    }
}
