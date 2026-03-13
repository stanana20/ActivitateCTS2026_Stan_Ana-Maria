package simple_factory.main;

import simple_factory.clase.Autobuz;
import simple_factory.clase.MijlocTransport;
import simple_factory.factory.Depou;
import simple_factory.factory.Tip;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Depou depou = new Depou();
        MijlocTransport autobuz = depou.getMijlocTransport(Tip.AUTOBUZ, 4, "B149ABC");
        MijlocTransport tramvai = depou.getMijlocTransport(Tip.TRAMVAI, 20,"B222XYZ");

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
    }
}
