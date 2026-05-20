package Proxy.main;

import Proxy.clase.Credit;
import Proxy.clase.ICredit;
import Proxy.clase.ProxyCredit;

public class Main {
    public static void main(String[] args) {
        ICredit credit = new Credit("EUR");
        credit.realizareCredit();

        ICredit proxy = new ProxyCredit((Credit) credit);
        proxy.realizareCredit();
    }
}
