package Decorator.clase;

import java.util.List;

public class DecoratorSpital extends Decorator{
    public DecoratorSpital(ISpital spital) {
        super(spital);
    }

    @Override
    public void verificaEchipament(List<IVizitator> vizitatori) {
        int nrVizitatori =0;
        for(IVizitator vizitator: vizitatori){
            if(vizitator.getScrisoareMedicala()=="true"){
                nrVizitatori++;
            }
        }
        if(nrVizitatori>=3){
            System.out.println("Am echipat vizitatorii si pot intra!");
        }else{
            System.out.println("Nu avem numarul minim de vizitatori!");
        }
    }
}
