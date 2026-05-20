package Decorator.clase;

import java.util.List;

public abstract class Decorator implements ISpital {
    private ISpital spital;

    public Decorator(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public boolean accesVizitator(IVizitator vizitator) {
        return this.spital.accesVizitator(vizitator);
    }

    @Override
    public boolean verificareScrisoare(IVizitator vizitator) {
        return this.spital.verificareScrisoare(vizitator);
    }

    public abstract void verificaEchipament(List<IVizitator> vizitatori);
}
