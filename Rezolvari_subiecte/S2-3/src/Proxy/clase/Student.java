package Proxy.clase;

public class Student {
    private String nume;
    private int activitate;

    public Student(String nume, int activitate) {
        this.nume = nume;
        this.activitate = activitate;
    }

    public String getNume() {
        return nume;
    }

    public int getActivitate() {
        return activitate;
    }
}
