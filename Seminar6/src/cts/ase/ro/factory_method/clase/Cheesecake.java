package cts.ase.ro.factory_method.clase;

public class Cheesecake extends Desert{
    public Cheesecake(float pret, float gramaj, int calorii) {
        super(pret, gramaj, calorii);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder("Cheesecake[");
        sb.append(super.toString()).append("]");
        System.out.println(sb);
    }
}
