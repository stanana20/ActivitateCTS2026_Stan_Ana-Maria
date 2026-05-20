package Composite.clase;

public class Filiala implements IBanca{
    private String adresa;

    public Filiala(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public void adaugaNod(IBanca banca) throws Exception {
        throw new Exception("Nu exista alte noduri!");
    }

    @Override
    public void stergeNod(IBanca banca) throws Exception {
        throw new Exception("Nu exista alte noduri!");

    }

    @Override
    public void descriere() {
        System.out.println(this.adresa);
    }

}
