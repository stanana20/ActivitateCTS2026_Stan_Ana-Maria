package simple_factory.clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Tramvaiul ");
        sb.append("are ").append(super.nrRoti).append(" si are numarul de inmatriculare ")
                .append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
