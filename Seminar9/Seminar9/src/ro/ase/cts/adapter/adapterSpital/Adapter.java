package ro.ase.cts.adapter.adapterSpital;

import ro.ase.cts.adapter.clase.spital.Medicament;

public class Adapter extends ro.ase.cts.adapter.clase.farmacie.Medicament {
    private Medicament medicament;

    public Adapter(Medicament medicament) {
        super(medicament.getDenumire());
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        medicament.achizitioneazaMedicament();
    }
}
