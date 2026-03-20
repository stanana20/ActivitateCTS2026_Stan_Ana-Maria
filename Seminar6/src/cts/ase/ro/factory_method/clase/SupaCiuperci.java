package cts.ase.ro.factory_method.clase;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(float pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder("Supa de ciuperci[");
        sb.append(super.toString()).append("]");
        System.out.println(sb);
    }
}
