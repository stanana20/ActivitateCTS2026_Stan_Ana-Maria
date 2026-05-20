package Strategy.main;

import Strategy.clase.Client;
import Strategy.clase.ExteriorInterior;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Popescu");
        client.spala();

        client.setMod(new ExteriorInterior());
        client.spala();
    }
}
