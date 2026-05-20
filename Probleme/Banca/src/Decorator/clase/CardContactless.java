package Decorator.clase;

public class CardContactless extends Decorator{
    public CardContactless(ICard cardDecorat) {
        super(cardDecorat);
    }

    @Override
    public void platesteContactless() {
        System.out.println("S-a realizat plata contactless!");
    }
}
