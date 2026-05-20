package Observer.clase;

public interface ISpalatorie {
    void trimiteMesaj(String mesaj);
    void adaugaClient(IClient client);
    void stergeClient(IClient client);
}
