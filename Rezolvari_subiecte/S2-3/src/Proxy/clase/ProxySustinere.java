package Proxy.clase;

public class ProxySustinere implements ISustinereExamen{
   private ISustinereExamen sustinereExamen;

    public ProxySustinere(ISustinereExamen sustinereExamen) {
        this.sustinereExamen = sustinereExamen;
    }

    @Override
    public void sustineExamen() {
        if(((SustinereExamen)this.sustinereExamen).getStudent().getActivitate()>=2){
            this.sustinereExamen.sustineExamen();
        }else{
            System.out.println("Vei sustine examenul in sesiunea de restante!");
        }
    }
}
