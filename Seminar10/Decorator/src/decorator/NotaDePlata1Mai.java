package decorator;

import clase.NotaDePlataAbstract;

public class NotaDePlata1Mai extends NotaDePlataDecorator {
    public NotaDePlata1Mai(NotaDePlataAbstract nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de 1 Mai!");
    }
}
