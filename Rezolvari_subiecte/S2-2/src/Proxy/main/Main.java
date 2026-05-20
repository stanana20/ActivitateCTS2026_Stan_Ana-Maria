package Proxy.main;

import Proxy.clase.Client;
import Proxy.clase.ISpalatorie;
import Proxy.clase.ProxySpalatorie;
import Proxy.clase.Spalatorie;

public class Main {
    public static void main(String[] args) {
        Client client1= new Client("Popescu", true);
        Client client2= new Client("Ionescu", false);

        ISpalatorie spalatorie1 = new Spalatorie("Bubbles", 20, client1);
        ISpalatorie spalatorie2 = new Spalatorie("Wash", 15, client2);

        ISpalatorie proxySpalatorie1 = new ProxySpalatorie(spalatorie1);
        ISpalatorie proxySpalatorie2 = new ProxySpalatorie(spalatorie2);
        proxySpalatorie1.spala();
        proxySpalatorie2.spala();
    }
}
