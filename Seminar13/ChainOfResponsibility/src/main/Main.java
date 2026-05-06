package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();

        calatorieTroleibuz.setSuccesor(calatorieAutobuz);
        //calatorieAutobuz.setSuccesor(calatorieTramvai);
        calatorieAutobuz.setSuccesor(calatorieMetrou);
        //calatorieTramvai.setSuccesor(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandaMijlocTransport(5));
        System.out.println(calatorieTroleibuz.recomandaMijlocTransport(12));
        System.out.println(calatorieTroleibuz.recomandaMijlocTransport(2));
        System.out.println(calatorieTroleibuz.recomandaMijlocTransport(4));
    }
}
