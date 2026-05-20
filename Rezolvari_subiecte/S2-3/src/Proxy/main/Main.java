package Proxy.main;

import Proxy.clase.ISustinereExamen;
import Proxy.clase.ProxySustinere;
import Proxy.clase.Student;
import Proxy.clase.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Popescu", 2);
        Student student2 = new Student("Ioenscu", 1);

        ISustinereExamen sustinereExamen1 = new SustinereExamen(student1);
        ISustinereExamen sustinereExamen2 = new SustinereExamen(student2);
        sustinereExamen1.sustineExamen();
        sustinereExamen2.sustineExamen();

        ISustinereExamen proxySustinere1 = new ProxySustinere(sustinereExamen1);
        ISustinereExamen proxySustinere2 = new ProxySustinere(sustinereExamen2);
        proxySustinere1.sustineExamen();
        proxySustinere2.sustineExamen();
    }
}
