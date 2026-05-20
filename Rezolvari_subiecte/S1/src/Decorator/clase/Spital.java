package Decorator.clase;

public class Spital implements ISpital{
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public boolean verificareScrisoare(IVizitator vizitator) {
        if(vizitator.getScrisoareMedicala()=="true"){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean accesVizitator(IVizitator vizitator) {
        if(verificareScrisoare(vizitator)){
            System.out.println("Vizitatorul "+vizitator.getNume()+" poate intra!");
            return true;
        }else{
            return false;
        }
    }
}
