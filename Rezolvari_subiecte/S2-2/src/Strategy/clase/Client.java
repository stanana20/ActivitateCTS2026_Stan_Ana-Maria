package Strategy.clase;

public class Client {
    private String nume;
    private ModSpalare mod;

    public Client(String nume, ModSpalare mod) {
        this.nume = nume;
        this.mod = mod;
    }

    public Client(String nume) {
        this.nume = nume;
        this.mod = new Exterior();
    }

    public void setMod(ModSpalare mod) {
        this.mod = mod;
    }

    public void spala(){
        this.mod.spala();
    }
}
