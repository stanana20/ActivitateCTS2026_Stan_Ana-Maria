package cts.ase.ro.prototype.clase;

public class Rezervare implements RezervareAbstracta {
    private String numeClient;
    private int oraRezervare;
    private int ziuaRezervarii;
    private String nrTelefon;

    private Rezervare() {
    }

    public Rezervare(String numeClient, int oraRezervare, int ziuaRezervarii, String nrTelefon) {
        if (numeClient.length() > 2) {
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Popescu";
        }
        if (oraRezervare < 23 && oraRezervare > 9) {
            this.oraRezervare = oraRezervare;
        } else {
            this.oraRezervare = 9;
        }
        if (ziuaRezervarii < 30) {
            this.ziuaRezervarii = ziuaRezervarii;
        } else {
            this.ziuaRezervarii = 1;
        }
        if (nrTelefon.length() == 10) {
            this.nrTelefon = nrTelefon;
        } else {
            this.nrTelefon = "071234567";
        }
    }

    public void setOraRezervare(int oraRezervare) {
        if (oraRezervare < 23 && oraRezervare > 9) {
            this.oraRezervare = oraRezervare;
        } else {
            this.oraRezervare = 9;
        }
    }

    public void setZiuaRezervarii(int ziuaRezervarii) {
        if (ziuaRezervarii < 30) {
            this.ziuaRezervarii = ziuaRezervarii;
        } else {
            this.ziuaRezervarii = 1;
        }
    }

    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervare = new Rezervare();
        rezervare.numeClient = this.numeClient;
        rezervare.nrTelefon = this.nrTelefon;
        rezervare.oraRezervare = this.oraRezervare;
        rezervare.ziuaRezervarii = this.ziuaRezervarii;

        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziuaRezervarii=").append(ziuaRezervarii);
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
