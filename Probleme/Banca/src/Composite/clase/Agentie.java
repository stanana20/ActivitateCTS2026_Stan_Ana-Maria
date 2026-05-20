package Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements IBanca{
    private String nume;
    private List<IBanca> colectie = new ArrayList<>();

    public Agentie(String nume, List<IBanca> colectie) {
        this.nume = nume;
        this.colectie = colectie;
    }

    @Override
    public void adaugaNod(IBanca banca) throws Exception {
        colectie.add(banca);
    }

    @Override
    public void stergeNod(IBanca banca) throws Exception {
colectie.remove(banca);
    }

    @Override
    public void descriere() {
        System.out.println(this.nume);
        for(IBanca b: colectie){
            b.descriere();
        }
    }


}
