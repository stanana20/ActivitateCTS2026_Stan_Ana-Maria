package Observer.main;

import Observer.clase.IProfesor;
import Observer.clase.IStudent;
import Observer.clase.Profesor;
import Observer.clase.Student;

public class Main {
    public static void main(String[] args) {
        IStudent student1 =new Student("Ionescu", 1);
        IStudent student2 =new Student("Popescu", 2);
        IStudent student3 =new Student("Davidescu", 3);

        IProfesor profesor = new Profesor("Florescu");
        profesor.adaugaStudent(student1);
        profesor.adaugaStudent(student2);
        profesor.adaugaStudent(student3);

        ((Profesor)profesor).schimbareSala();
        ((Profesor)profesor).schimbareOra();
        ((Profesor)profesor).clarifica();
    }
}
