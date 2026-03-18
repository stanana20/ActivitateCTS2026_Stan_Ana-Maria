package cts.ase.ro.builder.main;


import cts.ase.ro.builder.builder01.AbstractBuilder;
import cts.ase.ro.builder.builder01.Internare;
import cts.ase.ro.builder.builder01.InternareBuilder;
import cts.ase.ro.builder.builder02.AbstractBuilder02;
import cts.ase.ro.builder.builder02.InternareBuilder02;

public class Main {
    static void main(String[] args) {
        Internare internare1 = new Internare();
        internare1.setNumePacient("Georgescu");
        internare1.setPatRabatabil(true);

        Internare internare2 = new Internare();
        internare2.setNumePacient("Ionescu");
        internare2.setPatRabatabil(true);

        AbstractBuilder builder = new InternareBuilder("Florescu");

        Internare internare3 = builder.setPatRabatabil(true).build();
        Internare internare4 = builder.setArePapuci(true).setNume("Stanescu").build();

        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        AbstractBuilder02 builder2 = new InternareBuilder02();
        builder.setMicDejun(true);
        cts.ase.ro.builder.builder02.Internare internare5 = builder2.build("Danescu");
        cts.ase.ro.builder.builder02.Internare internare6 = builder2.build("Oprescu");

        System.out.println(internare5);

        internare5.setHalat(true);
    }
}
