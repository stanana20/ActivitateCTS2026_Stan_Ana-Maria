package clase;

public class CalatorieTroleibuz extends CalatorieHandler {

    @Override
    public String recomandaMijlocTransport(double distanta) {
        if (distanta < 3) {
            return "Troleibuz";
        }
        return super.succesor.recomandaMijlocTransport(distanta);
    }
}
