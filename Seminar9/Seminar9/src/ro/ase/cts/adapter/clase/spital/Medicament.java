package ro.ase.cts.adapter.clase.spital;

public class Medicament {
    private String denumire;
    private float pret;

    public Medicament(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void achizitioneazaMedicament() {
        if (prezintaReteta()) {
            System.out.println("S-a achizitionat medicamentul " + this.denumire + ", la pretul " + this.pret + " RON");
        } else {
            System.out.println("Clientul nu a prezentat reteta!");
        }
    }

    public boolean prezintaReteta() {
        return this.denumire.length() > 10;
    }
}
