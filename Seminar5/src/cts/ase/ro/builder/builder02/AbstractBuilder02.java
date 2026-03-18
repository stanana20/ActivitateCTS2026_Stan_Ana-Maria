package cts.ase.ro.builder.builder02;

public interface AbstractBuilder02 {
    Internare build(String nume);
    AbstractBuilder02 setPatRabatabil(boolean patRabatabil);
    AbstractBuilder02 setArePapuci(boolean arePapuci);
    AbstractBuilder02 setMicDejun(boolean areMicDejun);
    AbstractBuilder02 setAreHalat(boolean areHalat);
}
