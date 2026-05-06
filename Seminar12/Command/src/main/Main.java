package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Ionescu");
        PersonalSpital asistenta = new Asistenta("Popescu");

        Pacient pacient1 = new Pacient("Grigorescu", 45);
        Pacient pacient2 = new Pacient("Florescu", 45);

        Comanda internare = new Internare(pacient1, medic);
        Comanda tratare = new Tratare(pacient2, asistenta);

        Operator operator = new Operator();
        operator.inregistreazaComenzi(internare);
        operator.inregistreazaComenzi(tratare);
        operator.executaComanda();

        operator.inregistreazaComenzi(new Internare(new Pacient("Enescu", 24), medic));
        operator.executaComanda();
        operator.executaComanda();
    }
}
