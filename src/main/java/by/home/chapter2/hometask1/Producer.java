package by.home.chapter2.hometask1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    BlockingQueue queue;
    int numberBuyers;
    Buyer poisonPill;
    int poisonPillPerProducer;
    List<String> productList = new ArrayList<>();

    public Producer(BlockingQueue queue, int numberBuyers, Buyer poisonPill, int poisonPillPerProducer) {
        this.queue = queue;
        this.numberBuyers = numberBuyers;
        this.poisonPill = poisonPill;
        this.poisonPillPerProducer = poisonPillPerProducer;
    }

    @Override
    public void run() {
        productList.add("Молоко");
        productList.add("Масло");
        productList.add("Сыр");

        for (int i = 1; i <= numberBuyers; i++) {
            try {
                queue.put(new Buyer("Покупатель №" + i, productList));
            } catch (InterruptedException e) {
                System.out.println("Кривые покупатели");
            }
        }

        for (int i = 1; i <= poisonPillPerProducer; i++) {
            try {
                queue.put(poisonPill);
            } catch (InterruptedException e) {
                System.out.println("poisonPill crash");
            }
        }
    }
}
