package ro.ase.cts.adapter.main;

import ro.ase.cts.adapter.adapterSpital.Adapter;
import ro.ase.cts.adapter.clase.spital.Medicament;

public class Main {
    public static void procurareMedicamente(ro.ase.cts.adapter.clase.farmacie.Medicament medicament) {
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        Medicament medSpital = new Medicament("Nurofen forte", 25.99F);
        ro.ase.cts.adapter.clase.farmacie.Medicament medFarmacie = new ro.ase.cts.adapter.clase.farmacie.Medicament("Ibuprofen");

        medSpital.prezintaReteta();
        medSpital.achizitioneazaMedicament();

        medFarmacie.cumparaMedicament();

        procurareMedicamente(medFarmacie);
        //procurareMedicamente(medSpital);

        Adapter adapterMedicament = new Adapter(medSpital);
        procurareMedicamente(adapterMedicament);
    }
}
