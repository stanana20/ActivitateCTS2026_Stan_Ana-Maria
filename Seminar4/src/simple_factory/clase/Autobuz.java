package simple_factory.clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Autobuzul ");
        sb.append("are ").append(super.nrRoti).append(" si are numarul de inmatriculare ")
                .append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
