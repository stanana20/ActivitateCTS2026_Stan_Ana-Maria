package clase;

public class Tratare implements Comanda{
    private Pacient pacient;
    private PersonalSpital asistenta;

    public Tratare(Pacient pacient, PersonalSpital asistenta) {
        this.pacient = pacient;
        this.asistenta = asistenta;
    }

    @Override
    public void executa() {
        this.asistenta.preluarePacient(this.pacient);
    }
}
