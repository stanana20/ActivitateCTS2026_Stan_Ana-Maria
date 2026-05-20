package Decorator.clase;


public abstract class Decorator implements ICard {
   private ICard cardDecorat;

    public Decorator(ICard cardDecorat) {
        this.cardDecorat = cardDecorat;
    }

    @Override
    public void platesteOnline() {
this.cardDecorat.platesteOnline();
    }

    @Override
    public void platesteFizic() {
this.cardDecorat.platesteFizic();
    }

    public abstract void platesteContactless();

}
