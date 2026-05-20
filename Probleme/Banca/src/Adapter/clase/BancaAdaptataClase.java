package Adapter.clase;

public class BancaAdaptataClase extends CreditLeasing implements IBanca{
    public BancaAdaptataClase(double suma) {
        super(suma);
    }

    @Override
    public void acordaCredit() {
        super.acordaCreditLeasing();
    }
}
