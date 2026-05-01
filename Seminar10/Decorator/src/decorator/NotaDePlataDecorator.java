package decorator;

import clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstract {
    private NotaDePlataAbstract nota;

    public NotaDePlataDecorator(NotaDePlataAbstract nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza();
    }

    public abstract void printeazaFelicitare();
}
