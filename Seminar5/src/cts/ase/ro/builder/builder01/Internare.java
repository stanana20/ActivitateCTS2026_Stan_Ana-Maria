package cts.ase.ro.builder.builder01;

public class Internare {
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halat;

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }

    public Internare() {
        this.numePacient = "Popescu";
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuciCamera = false;
        this.halat = false;
    }

    public Internare(String numePacient, boolean patRabatabil, boolean micDejun, boolean papuciCamera, boolean halat) {
        this.numePacient = numePacient;
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciCamera = papuciCamera;
        this.halat = halat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuciCamera=").append(papuciCamera);
        sb.append(", halat=").append(halat);
        sb.append('}');
        return sb.toString();
    }
}
