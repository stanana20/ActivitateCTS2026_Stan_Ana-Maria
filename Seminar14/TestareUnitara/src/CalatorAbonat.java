public class CalatorAbonat {
    private String nume;
    private float sold;

    public void platesteBilet(float pret){
        if(this.sold>pret){
            System.out.println(this.nume+", plateste "+pret+" pentru o calatorie!");
            this.sold-=pret;
        }else{
            System.out.println("Sold insuficient. Mergeti pe jos!");
        }
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public CalatorAbonat(String nume) {
        this.nume = nume;
    }

    public void receptioneazaMesaj(String mesaj) {
        System.out.printf(this.nume+", ai primit urmatorul mesaj: "+ mesaj);
    }
}
