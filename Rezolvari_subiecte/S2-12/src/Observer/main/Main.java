package Observer.main;

import Observer.clase.Client;
import Observer.clase.IClient;
import Observer.clase.ISpalatorie;
import Observer.clase.Spalatorie;

public class Main {
    public static void main(String[] args) {
        IClient client1 = new Client("Popescu");
        IClient client2 = new Client("Ionescu");
        IClient client3 = new Client("Davidescu");

        ISpalatorie spalatorie = new Spalatorie("Bubbles");
        spalatorie.adaugaClient(client1);
        spalatorie.adaugaClient(client2);
        spalatorie.adaugaClient(client3);

        ((Spalatorie)spalatorie).eliberareSlot();
        ((Spalatorie)spalatorie).instiintareNrPersoaneInAsteptare();

        spalatorie.stergeClient(client1);
        ((Spalatorie)spalatorie).instiintareNrPersoaneInAsteptare();
    }
}
