package main;

import clase.NotaDePlata;
import clase.NotaDePlataAbstract;
import decorator.NotaDePlata1Mai;
import decorator.NotaDePlataDecorator;
import decorator.NotaDePlataNoulAn;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract nota = new NotaDePlata(200, "29.04.2026");
        nota.printeaza();


        NotaDePlataDecorator notaDecorata; // = new NotaDePlataNoulAn(nota);
//        notaDecorata.printeaza();
//        notaDecorata.printeazaFelicitare(); //adaugata la runtime

        int input = 2; //1 = Anul Nou; 2 = 1 Mai
        if (input == 1) {
            notaDecorata = new NotaDePlataNoulAn(nota);
        } else {
            notaDecorata = new NotaDePlata1Mai(nota);
        }
        notaDecorata.printeaza();
        notaDecorata.printeazaFelicitare();
    }
}