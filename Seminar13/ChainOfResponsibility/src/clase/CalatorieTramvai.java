package clase;

public class CalatorieTramvai extends CalatorieHandler{

    @Override
    public String recomandaMijlocTransport(double distanta) {
        if(distanta<10){
            return "Tramvai";
        }
        return super.succesor.recomandaMijlocTransport(distanta);
    }
}
