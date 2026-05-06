package clase;

public abstract class CalatorieHandler {
    protected CalatorieHandler succesor;

    public void setSuccesor(CalatorieHandler succesor) {
        this.succesor = succesor;
    }

    public abstract String recomandaMijlocTransport(double distanta);
}
