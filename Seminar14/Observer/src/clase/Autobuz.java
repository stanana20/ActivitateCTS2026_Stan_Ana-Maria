package clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(String linie) {
        super(linie);
    }

    @Override
    public void pleacaDinDepou() {
        String mesaj = "Autobuzul de la linia "+super.linie+"a plecat1";
    }

    @Override
    public void ramaneBlocatInTrafic() {
        String mesaj = "Autobuzul de la linia "+super.linie+"a ramas blocat!";
    }
}
