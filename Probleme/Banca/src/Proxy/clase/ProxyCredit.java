package Proxy.clase;

public class ProxyCredit implements ICredit{
    private Credit credit;

    public ProxyCredit(Credit credit) {
        this.credit = credit;
    }

    @Override
    public void realizareCredit() {
        if(this.credit.getValuta().equals("RON")){
            this.credit.realizareCredit();
        }else{
            System.out.println("NU se pt realiza credit in alte valute!");
        }
    }
}
