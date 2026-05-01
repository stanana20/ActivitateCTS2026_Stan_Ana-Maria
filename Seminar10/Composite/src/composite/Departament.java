package composite;

import clase.Structura;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {
    private String nume;
    private List<Structura> structuri;

    public Departament(String nume) {
        this.nume = nume;
        this.structuri = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura) {
        structuri.add(structura);
    }

    public void stergeStructura(Structura structura) {
        structuri.remove(structura);
    }

    public Structura getStructura(int pozitie) {
        return structuri.get(pozitie);
    }

    @Override
    public void printeazaDetaliiStructura(String spatii) {
        System.out.println(spatii + "Departamentul " + this.nume);
        for (Structura s : structuri) {
            s.printeazaDetaliiStructura(spatii + "    ");
        }
    }
}
