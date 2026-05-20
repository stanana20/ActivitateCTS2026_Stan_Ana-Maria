package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Profesor implements IProfesor{
    private String nume;
    private List<IStudent> studenti = new ArrayList<>();

    public Profesor(String nume) {
        this.nume = nume;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(IStudent stud: studenti){
            stud.receptioneazaMesaj(mesaj);
        }
    }

    @Override
    public void adaugaStudent(IStudent student) {
        this.studenti.add(student);
    }

    @Override
    public void stergeStudent(IStudent student) {
        this.studenti.remove(student);
    }

    public void schimbareSala(){
        trimiteMesaj("S-a schimbat sala!");
    }

    public void schimbareOra(){
        trimiteMesaj("S-a schimbat ora!");
    }
    public void clarifica(){
        trimiteMesaj("Nu exista neclaritati!");
    }
}
