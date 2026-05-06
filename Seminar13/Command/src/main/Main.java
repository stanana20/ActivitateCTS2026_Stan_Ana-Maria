package main;

import clase.Autobuz;
import clase.Comanda;
import clase.Operator;
import clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Comanda comanda1 = new Plecare(new Autobuz("Mercedes"), 223);
        Comanda comanda2 = new Plecare(new Autobuz("Audi"), 178);

        Operator operator=new Operator();

        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(new Plecare(new Autobuz("Dacia"), 123));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
