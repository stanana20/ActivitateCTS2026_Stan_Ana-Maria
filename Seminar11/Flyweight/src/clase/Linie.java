package clase;

import java.sql.SQLOutput;

public class Linie implements LinieTransport {
    private String primaStatie;
    private String ultimaStatie;
    private int nrLinie;

    public Linie(String primaStatie, String ultimaStatie, int nrLinie) {
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
        this.nrLinie = nrLinie;
    }

    @Override
    public void descriereLinie(Autobuz autobuz) {
        System.out.println("Pe linia " + this.nrLinie + "(" + this.primaStatie + "-" + this.ultimaStatie + ")" + ", circula autobuzul " + autobuz.toString());
    }

    @Override
    public void nrMaximPasageriPeLinie(Autobuz autobuz) {
        System.out.println("Numarul maxim de calatori intre statiile " + this.primaStatie + " si " + this.ultimaStatie + " este de " + autobuz.getNrLocuri() + " locuri.");
    }
}
