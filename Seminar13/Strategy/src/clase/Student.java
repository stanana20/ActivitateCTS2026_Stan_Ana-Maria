package clase;

public class Student {
    private String nume;
    private ModSustinere modSustinere;

    public Student(String nume, ModSustinere modSustinere) {
        this.nume = nume;
        this.modSustinere = modSustinere;
    }

    public Student(String nume) {
        this.nume = nume;
        this.modSustinere=new Grila();
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        this.modSustinere.sustinereExamen();
    }
}
