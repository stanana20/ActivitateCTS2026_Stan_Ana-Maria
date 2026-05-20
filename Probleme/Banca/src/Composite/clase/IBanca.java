package Composite.clase;

public interface IBanca {
    void adaugaNod(IBanca banca) throws Exception;
    void stergeNod(IBanca banca) throws Exception;
    void descriere();
}
