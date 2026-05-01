package main;

import clase.Autobuz;
import clase.ManagerLinie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz101 = new Autobuz("Mercedes-Benz Citaro", 2006, 100);
        Autobuz autobuz102 = new Autobuz("Otokar Kent C", 2018, 500);
        Autobuz autobuz103 = new Autobuz("Mercedes-Benz Citaro Hybrid", 2020, 500);

        ManagerLinie managerLinie = new ManagerLinie();
        managerLinie.getLinie(101, "Gara de Nord", "Otopeni").nrMaximPasageriPeLinie(autobuz101);
        managerLinie.getLinie(101, "Piata Romana", "Universitate").descriereLinie(autobuz101);
    }
}
