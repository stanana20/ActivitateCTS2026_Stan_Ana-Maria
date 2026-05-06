package clase;

public class Internare implements Comanda{
    private Pacient pacient;
    private PersonalSpital medic;

    public Internare(Pacient pacient, PersonalSpital medic) {
        this.pacient = pacient;
        this.medic = medic;
    }

    @Override
    public void executa() {
        this.medic.preluarePacient(this.pacient);
    }
}
