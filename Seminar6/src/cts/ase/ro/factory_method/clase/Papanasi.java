package cts.ase.ro.factory_method.clase;

public class Papanasi extends Desert{
    public Papanasi(float pret, float gramaj, int calorii) {
        super(pret, gramaj, calorii);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder("Papanasi[");
        sb.append(super.toString()).append("]");
        System.out.println(sb);
    }
}
