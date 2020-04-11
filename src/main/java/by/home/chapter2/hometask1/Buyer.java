package by.home.chapter2.hometask1;

import java.util.List;

import static java.lang.Thread.sleep;

public class Buyer extends Thread {

    List<String> productList;
    List<CashDesk> cashDesks;

    public Buyer(String name, List<String> product, List<CashDesk> cashDesks) {
        super(name);
        this.productList = product;
        this.cashDesks = cashDesks;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(cashDesks.get(0).getProductList(this));
    }
}
