package singleton.main;

import singleton.clase.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstancee("ABC", 7, 5);
        Hotel hotel2 = Hotel.getInstancee("CDE", 300, 0);

        hotel1.rezervaCamera();
        hotel1.rezervaCamera();
        hotel1.afisezaDescriere();

        hotel2.rezervaCamera();
        hotel2.rezervaCamera();
        hotel2.afisezaDescriere();
    }
}