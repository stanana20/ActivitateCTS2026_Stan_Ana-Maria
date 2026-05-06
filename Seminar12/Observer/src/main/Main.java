package main;

import clase.ISpital;
import clase.Pacient;
import clase.PacientAbonat;
import clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Popescu", 30);
        Pacient pacient2 = new PacientAbonat("Davidescu", 40);
        Pacient pacient3 = new PacientAbonat("Ionescu", 50);

        ISpital spital = new Spital("Cantacuzino");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);


        ((Spital) spital).notificaEpidemie();
        System.out.println("------------------------");
        spital.dezaboneazaPacient(pacient2);
        ((Spital) spital).notificaVirus();


    }
}
