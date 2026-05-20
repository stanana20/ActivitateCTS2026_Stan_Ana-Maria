package Proxy.clase;

public class SustinereExamen implements ISustinereExamen{

    private Student student;
    public SustinereExamen(Student student) {
        this.student = student;
    }

    @Override
    public void sustineExamen() {
        System.out.println("Studentul "+this.student.getNume()+" a sustinut examenul!");
    }

    public Student getStudent() {
        return student;
    }
}
