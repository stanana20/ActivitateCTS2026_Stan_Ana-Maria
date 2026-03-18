package cts.ase.ro.builder.builder01;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNume(String numePacient);
    AbstractBuilder setPatRabatabil(boolean patRabatabil);
    AbstractBuilder setArePapuci(boolean arePapuci);
    AbstractBuilder setMicDejun(boolean areMicDejun);
    AbstractBuilder setAreHalat(boolean areHalat);
}
