package main;

import clase.Sectie;
import clase.Structura;
import composite.Departament;

public class Main {
    public static void main(String[] args) {

        Structura departamentSpital = new Departament("Spital");
        Structura departamentAdministrativ = new Departament("Administrativ");

        Structura sectieSecretariat = new Sectie("Secretariat", 20);
        Structura sectieManagement = new Sectie("Management", 14);

        ((Departament) departamentSpital).adaugaStructura(departamentAdministrativ);
        ((Departament) departamentSpital).adaugaStructura(sectieManagement);
        ((Departament) departamentAdministrativ).adaugaStructura(sectieSecretariat);

        departamentSpital.printeazaDetaliiStructura("");

        ((Departament) departamentSpital).stergeStructura(sectieManagement);
        ((Departament) departamentAdministrativ).adaugaStructura(sectieManagement);
        System.out.println("\nDUPA MODIFICARE:");
        departamentSpital.printeazaDetaliiStructura("");
    }
}
