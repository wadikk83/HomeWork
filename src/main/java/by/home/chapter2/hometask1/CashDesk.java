package by.home.chapter2.hometask1;

import java.util.List;

public class CashDesk {
    String cashDeskName;

    public CashDesk(String cashDeskName) {
        this.cashDeskName = cashDeskName;
    }

    public String getCashDeskName() {
        return cashDeskName;
    }

    public synchronized String getProductList(Buyer buyer) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Город спит, просыпается мафия !");
        }
        return buyer.getName() + " купил в " + cashDeskName + " следующие продукты: " + buyer.productList.toString();
    }
}
