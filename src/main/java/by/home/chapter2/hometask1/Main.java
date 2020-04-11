package by.home.chapter2.hometask1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final int NUMBER_CASHDESKS = 2;
        List<String> productList = new ArrayList<>();
        productList.add("Молоко");
        productList.add("Масло");
        productList.add("Сыр");

        List<CashDesk> cashDesks = new ArrayList<>();
        for (int i = 1; i <= NUMBER_CASHDESKS; i++) {
            cashDesks.add(new CashDesk("Касса №" + i));
        }

        for (int i = 1; i < 10; i++) {
            new Buyer("Покупатель №" + i, productList, cashDesks);
        }
        System.out.println("Main thread finished...");
    }
}
