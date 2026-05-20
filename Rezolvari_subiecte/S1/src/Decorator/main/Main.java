package Decorator.main;

import Decorator.clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IVizitator vizitator1 = new Vizitator("true", "Popescu");
        IVizitator vizitator2= new Vizitator("true", "Ionescu");
        IVizitator vizitator3 = new Vizitator("true", "Andreescu");
        IVizitator vizitator4 = new Vizitator("false", "Stanescu");

        ISpital spital = new Spital("Floreasca");
        spital.accesVizitator(vizitator1);
        spital.accesVizitator(vizitator2);
        spital.accesVizitator(vizitator3);
        spital.accesVizitator(vizitator4);

        Decorator spitalDecorat = new DecoratorSpital(spital);
        spitalDecorat.accesVizitator(vizitator1);
        spitalDecorat.accesVizitator(vizitator2);
        spitalDecorat.accesVizitator(vizitator3);
        spitalDecorat.accesVizitator(vizitator4);

        List<IVizitator> vizitatori = new ArrayList<>();
        vizitatori.add(vizitator1);
        vizitatori.add(vizitator2);
        vizitatori.add(vizitator3);
        vizitatori.add(vizitator4);
        spitalDecorat.verificaEchipament(vizitatori);
    }
}
