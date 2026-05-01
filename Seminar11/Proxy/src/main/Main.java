package main;

import clase.Autobuz;
import clase.MijlocTransport;
import clase.Statie;
import clase.TipCursa;
import proxy.AutobuzCursaSpeciala;
import proxy.AutobuzDeNoapte;

public class Main {
    public static void main(String[] args) {
        Statie statieRomana = new Statie("Piata Romana", 18);
        Statie statieUniversitate = new Statie("Universitate", 0);

        MijlocTransport autobuz168 = new Autobuz(20, 168);
        MijlocTransport autobuz226 = new Autobuz(0, 226);

        autobuz168.opresteInStatie(statieRomana);
        autobuz226.opresteInStatie(statieUniversitate);

        System.out.println("-----------------------------------------------");
        MijlocTransport autobuzDeNoapte168 = new AutobuzDeNoapte(autobuz168);
        MijlocTransport autobuzDeNoapte226 = new AutobuzDeNoapte(autobuz226);

        autobuzDeNoapte168.opresteInStatie(statieRomana);
        autobuzDeNoapte226.opresteInStatie(statieUniversitate);

        System.out.println("-----------------------------------------------");
        MijlocTransport autobuz = new Autobuz(12, 6, TipCursa.CURSA_SPECIALA);
        MijlocTransport autobuzCursaSpeciala = new AutobuzCursaSpeciala(autobuz);
        MijlocTransport autobuzCursaSpeciala168 = new AutobuzCursaSpeciala(autobuz168);

        autobuzCursaSpeciala.opresteInStatie(statieRomana);
        autobuzCursaSpeciala168.opresteInStatie(statieUniversitate);
    }
}
