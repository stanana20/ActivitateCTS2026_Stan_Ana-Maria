package main;

import clase.ProbaScrisa;
import clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Vasilescu");

        student.examinare();

        student.setModSustinere(new ProbaScrisa());
        student.examinare();

        student.setModSustinere(new ProbaScrisa());
        student.examinare();
    }
}
