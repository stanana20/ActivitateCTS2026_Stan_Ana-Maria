package ro.ase.cts.adapter.clase.farmacie;

public class Medicament {
    private String denumire;

    public Medicament(String denumire) {
        this.denumire = denumire;
    }

    public void cumparaMedicament() {
        System.out.println("S-a achizitionat medicamentul " + this.denumire);
    }

    ;
}
