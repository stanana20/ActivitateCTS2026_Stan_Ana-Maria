package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Medic;
import ro.ase.cts.facade.clase.Pacient;
import ro.ase.cts.facade.clase.ReceptieSpital;
import ro.ase.cts.facade.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Popescu", 5);
        Medic medic = new Medic();
        Salon salon = new Salon();

        if (medic.areTrimitere(pacient)) {
            int patLiber = salon.getPatLiber();
            if (patLiber != -1) {
                System.out.println("Pacientul " + pacient.getNume() + " va fi internat in patul " + patLiber);
                salon.ocupaPat(patLiber);
            }

        }
        Pacient pacient2 = new Pacient("Ionescu", 2);
        Pacient pacient3 = new Pacient("Georgescu", 6);
        Pacient pacient4 = new Pacient("Davidescu", 10);

        ReceptieSpital receptieSpital = new ReceptieSpital(medic, salon);
        receptieSpital.interneazaPacient(pacient2);
        receptieSpital.interneazaPacient(pacient3);
        receptieSpital.interneazaPacient(pacient4);

    }
}
