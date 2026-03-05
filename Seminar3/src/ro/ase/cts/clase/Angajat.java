package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;
    private static int valoare_finantare_angajat = 10;

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumire_Proiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public Angajat() {
        super();

    }

    public static void setValoare_finantare_angajat(int valoare_finantare_angajat) {
        Angajat.valoare_finantare_angajat = valoare_finantare_angajat;
    }

    @Override
    public void afiseazaFinantare() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste " + Angajat.valoare_finantare_angajat + " Euro/zi in proiect.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Angajat{");
        sb.append(super.toString());
        sb.append("ocupatie='").append(ocupatie).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
