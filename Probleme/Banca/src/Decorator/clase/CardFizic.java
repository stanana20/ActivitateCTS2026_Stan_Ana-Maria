package Decorator.clase;

public class CardFizic implements ICard{
    private String dataExpirarii;

    public CardFizic(String dataExpirarii) {
        this.dataExpirarii = dataExpirarii;
    }

    @Override
    public void platesteOnline() {
        System.out.println("S-a efectuat o plata online!");
    }

    @Override
    public void platesteFizic() {
        System.out.println("S-a efectuat o plata fizica!");

    }
}
