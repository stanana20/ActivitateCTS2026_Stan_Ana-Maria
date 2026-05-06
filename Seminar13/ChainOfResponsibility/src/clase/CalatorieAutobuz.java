package clase;

public class CalatorieAutobuz extends CalatorieHandler{

    @Override
    public String recomandaMijlocTransport(double distanta) {
        if(distanta<5){
            return "Autobuz";
        }
        return super.succesor.recomandaMijlocTransport(distanta);
    }
}
