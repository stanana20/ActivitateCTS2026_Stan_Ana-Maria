package Proxy.clase;

public class Spalatorie implements ISpalatorie{
    private String nume;
    private int nrAngajati;

    private Client client;

    public Spalatorie(String nume, int nrAngajati, Client client) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public void spala() {
        System.out.println("S-a spalat masina clientului "+this.client.getNume());
    }
}
