package cts.ase.ro.builder.builder01;

public class InternareBuilder implements AbstractBuilder{
    private Internare internare;

    public InternareBuilder(String nume) {
        this.internare = new Internare(nume, false, false, false, false);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNume(String numePacient) {
        this.internare.setNumePacient(numePacient);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean patRabatabil) {
        this.internare.setPatRabatabil(patRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setArePapuci(boolean arePapuci) {
        this.internare.setPapuciCamera(arePapuci);
        return this;
    }

    @Override
    public AbstractBuilder setMicDejun(boolean areMicDejun) {
        this.internare.setMicDejun(areMicDejun);
        return this;
    }

    @Override
    public AbstractBuilder setAreHalat(boolean areHalat) {
        this.internare.setHalat(areHalat);
        return this;
    }
}
