package cts.ase.ro.builder.builder02;


public class InternareBuilder02 implements AbstractBuilder02 {

    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halat;

    public InternareBuilder02() {
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuciCamera = false;
        this.halat = false;
    }

    @Override
    public Internare build(String nume) {
        return new Internare(nume, patRabatabil, micDejun, papuciCamera, halat);
    }

    @Override
    public AbstractBuilder02 setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder02 setArePapuci(boolean arePapuci) {
        this.papuciCamera = arePapuci;
        return this;
    }

    @Override
    public AbstractBuilder02 setMicDejun(boolean areMicDejun) {
        this.micDejun = micDejun;
        return this;
    }

    @Override
    public AbstractBuilder02 setAreHalat(boolean areHalat) {
        this.halat = areHalat;
        return this;
    }
}
