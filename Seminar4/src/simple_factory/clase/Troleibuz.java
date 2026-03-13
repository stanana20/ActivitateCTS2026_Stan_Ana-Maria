package simple_factory.clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Troleibuzul ");
        sb.append("are ").append(super.nrRoti).append(" si are numarul de inmatriculare ")
                .append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
