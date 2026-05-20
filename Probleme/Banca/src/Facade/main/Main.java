package Facade.main;

import Facade.clase.Client;
import Facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Client client=new Client(45, "Ionescu");

        Facade facade = new Facade();
        facade.verificareClient(client);
    }
}
