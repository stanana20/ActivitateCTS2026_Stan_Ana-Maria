package decorator;

import clase.NotaDePlataAbstract;

public class NotaDePlataNoulAn extends NotaDePlataDecorator {
    public NotaDePlataNoulAn(NotaDePlataAbstract nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de Anul Nou!");
    }
}
