package Observer.clase;

public interface IProfesor {
    void trimiteMesaj(String mesaj);
    void adaugaStudent(IStudent student);
    void stergeStudent(IStudent student);
//    IStudent getStudent(int id);
}
