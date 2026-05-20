package Observer.clase;

public class Student implements IStudent{
    private String nume;
    private int id;

    public Student(String nume, int id) {
        this.nume = nume;
        this.id = id;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Studentul "+this.nume+" a receptionat mesajul: "+mesaj);
    }
}
