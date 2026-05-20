package Proxy.clase;

public class ProxySpalatorie implements ISpalatorie{
    private ISpalatorie spalatorie;

    public ProxySpalatorie(ISpalatorie spalatorie) {
        this.spalatorie = spalatorie;
    }

    @Override
    public void spala() {
        if(((Spalatorie)this.spalatorie).getClient().isAreAbonament()){
            this.spalatorie.spala();
        }else{
            System.out.println("Nu sunt locuri disponibile!");
        }
    }
}
