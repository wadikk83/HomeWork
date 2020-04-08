package com.company.Lesson6;

public class BankCard extends Card {

    @Override
    public int getNumberCard() {
        return super.getNumberCard();
    }

    @Override
    public int getPinCode() {
        return super.getPinCode();
    }

    @Override
    public int getBalans() {
        return super.getBalans();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public BankCard(int numberCard, int pinCode, int balans, String name) {
        this.numberCard = numberCard;
        this.pinCode = pinCode;
        this.balans = balans;
        this.name = name;
    }


    public BankCard() {
        super.numberCard = 0;
        super.pinCode = 1111;
        super.balans = 0;
        super.name = "Unknown";
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "numberCard=" + numberCard +
                ", pinCode=" + pinCode +
                ", balans=" + balans +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void setBalans(int balans) {
        super.setBalans(balans);
    }
}
