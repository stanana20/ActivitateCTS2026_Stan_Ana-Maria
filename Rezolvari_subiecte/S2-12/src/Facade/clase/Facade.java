package Facade.clase;

public class Facade {
    public void spala(String brand){
        Degresator degresator = new Degresator(brand);
        degresator.degreseaza();

        Spumant spumant = new Spumant(brand);
        spumant.spumare();

        Laveta laveta = new Laveta(brand);
        laveta.sterge();
    }
}
