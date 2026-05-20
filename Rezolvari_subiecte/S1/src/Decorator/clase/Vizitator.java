package Decorator.clase;

public class Vizitator implements IVizitator{
    private String scrisoare;
    private String nume;

    public Vizitator(String scrisoare, String nume) {
        this.scrisoare = scrisoare;
        this.nume = nume;
    }

    @Override
    public String getScrisoareMedicala() {
        return this.scrisoare;
    }

    @Override
    public String getNume() {
        return this.nume;
    }
}
