package Adapter.clase;

public class CreditLeasing implements ICreditLeasing{
    public double suma;

    public CreditLeasing(double suma) {
        this.suma = suma;
    }

    @Override
    public void acordaCreditLeasing() {
        System.out.println("S-a acordat un credit in valoare de "+this.suma);
    }
}
