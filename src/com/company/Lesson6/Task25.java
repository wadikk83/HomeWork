package com.company.Lesson6;

public class Task25 {
    /**
     * Создать иерархию классов, описывающих банковские карточки.
     * Иерархия должны иметь хотя бы 3 уровня
     */
    public static void main(String[] args) {
        GoldCard card1 = new GoldCard(123, 1111, 0, "Pupkin", Status.GOLD);
        System.out.println(card1);
        GoldCard card2 = new GoldCard(Status.PLATINA);
        System.out.println(card2);
        System.out.println(card2.status.status);


    }
}
