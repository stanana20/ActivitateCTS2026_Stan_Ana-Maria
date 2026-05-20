package main;

import clase.Autobuz;
import clase.Calator;
import clase.CalatorAbonat;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        Calator calator1 = new CalatorAbonat("Ionescu");
        Calator calator2 = new CalatorAbonat("Popescu");
        Calator calator3 = new CalatorAbonat("Alexandrescu");

        MijlocTransport autobuz = new Autobuz("123");
        autobuz.aboneazaCalator(calator1);
        autobuz.aboneazaCalator(calator2);

        autobuz.pleacaDinDepou();

        autobuz.aboneazaCalator(calator3);
        autobuz.dezaboneazaCalator(calator1);
        autobuz.ramaneBlocatInTrafic();
    }
}
