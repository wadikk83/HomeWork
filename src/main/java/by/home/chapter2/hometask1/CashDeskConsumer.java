package by.home.chapter2.hometask1;

import java.util.concurrent.BlockingQueue;

public class CashDeskConsumer implements Runnable {
    String cashDeskName;
    BlockingQueue queue;
    Buyer currentBuyer;
    Buyer poisonPill;

    public CashDeskConsumer(String cashDeskName, BlockingQueue queue, Buyer poisonPill) {
        this.cashDeskName = cashDeskName;
        this.queue = queue;
        this.poisonPill = poisonPill;
        System.out.println(this.cashDeskName + "открыта");
    }

    public String getCashDeskName() {
        return cashDeskName;
    }

    @Override
    public void run() {
        try {
            while (true) {
                currentBuyer = (Buyer) queue.take();
                if (currentBuyer == poisonPill) { //если ловим ядовитую таблетку - закрываем кассу
                    System.out.println(this.cashDeskName + " закрыта на переучет");
                    return;
                }

                int timer = (int) (Math.random() * 10000 / 2);
                Thread.sleep(timer);
                System.out.println(currentBuyer.name + " купил в " + this.cashDeskName + "следующие продукты: " + currentBuyer.productList.toString());
                System.out.println("Время обслуживания -> " + timer);

            }
        } catch (InterruptedException e) {
            System.out.println("Покупатель дебоширит " + this.cashDeskName);
        }
    }
}
