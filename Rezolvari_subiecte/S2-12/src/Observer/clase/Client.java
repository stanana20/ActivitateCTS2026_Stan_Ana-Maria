package Observer.clase;

public class Client implements IClient{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaMesajul(String mesaj) {
        System.out.println("Clientul "+this.nume+" a receptionat mesajul: "+mesaj);
    }
}
