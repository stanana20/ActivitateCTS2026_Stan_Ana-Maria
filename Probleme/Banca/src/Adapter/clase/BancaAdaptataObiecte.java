package Adapter.clase;

public class BancaAdaptataObiecte implements IBanca{
    private ICreditLeasing creditLeasing;

    public BancaAdaptataObiecte(ICreditLeasing creditLeasing) {
        this.creditLeasing = creditLeasing;
    }

    @Override
    public void acordaCredit() {
        this.creditLeasing.acordaCreditLeasing();
    }
}
