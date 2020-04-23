package by.home.chapter2.hometask1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final int NUMBER_CASHDESKS = 3;
        final int NUMBER_BUYERS = 15;
        final int BOUND_QUEUE = 10;

        Buyer poisonPill = new Buyer("happy-end", null); //ядовитая таблетка

        BlockingQueue<Buyer> queue = new LinkedBlockingQueue<>(BOUND_QUEUE);//очередь из покупателей

        new Thread(new Producer(queue, NUMBER_BUYERS, poisonPill, NUMBER_CASHDESKS)).start();//запускаем очередь покупателей

        for (int i = 1; i <= NUMBER_CASHDESKS; i++) { //запускаем очередь касс
            new Thread(new CashDeskConsumer("Касса №" + i, queue, poisonPill)).start();
        }

    }
}
