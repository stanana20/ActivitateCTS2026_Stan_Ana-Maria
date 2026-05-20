package Decorator.main;

import Decorator.clase.CardContactless;
import Decorator.clase.CardFizic;
import Decorator.clase.ICard;

public class Main {
    public static void main(String[] args) {
        ICard card = new CardFizic("12.12.2026");
        card.platesteFizic();

        CardContactless cardContactless = new CardContactless(card);
         cardContactless.platesteContactless();
         cardContactless.platesteFizic();
    }
}
