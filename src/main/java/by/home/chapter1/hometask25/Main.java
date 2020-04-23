package by.home.chapter1.hometask25;

public class Main {
    public static void main(String[] args) {
        GoldCard card1 = new GoldCard(123, 1111, 0, "Pupkin", Status.GOLD);
        System.out.println(card1);
        GoldCard card2 = new GoldCard(Status.PLATINA);
        System.out.println(card2);
        System.out.println(card2.status.status);


    }
}
