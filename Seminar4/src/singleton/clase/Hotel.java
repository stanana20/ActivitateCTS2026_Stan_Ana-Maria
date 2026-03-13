package singleton.clase;

public class Hotel {
    private String nume;
    private int nrCamere;
    private int nrCamereOcupate;
    private static Hotel instanta = null;

    private Hotel(String nume, int nrCamere, int nrCamereOcupate) {
        this.nume = nume;
        this.nrCamere = nrCamere;
        this.nrCamereOcupate = nrCamereOcupate;
    }

    public static synchronized Hotel getInstancee(String nume, int nrCamere, int nrCamereOcupate){
        if(instanta == null){
            instanta = new Hotel(nume, nrCamere, nrCamereOcupate);
        }
        return instanta;
    }

    public void rezervaCamera(){
        if(this.nrCamereOcupate < this.nrCamere){
            System.out.println("Camera s-a rezervat!");
            this.nrCamereOcupate++;
        }
        else{
            System.out.println("NU s-a putut realiza rezervarea!");
        }
    }

    public void afisezaDescriere(){
        StringBuilder sb = new StringBuilder();
        sb.append("Hotelul ").append(this.nume).append(" are ").append(this.nrCamere-this.nrCamereOcupate).append(" camere libere.");
        System.out.println(sb);
    }
}
