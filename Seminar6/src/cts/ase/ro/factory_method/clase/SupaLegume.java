package cts.ase.ro.factory_method.clase;

public class SupaLegume extends Supa{
    public SupaLegume(float pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder("Supa de legume[");
        sb.append(super.toString()).append("]");
        System.out.println(sb);
    }
}
