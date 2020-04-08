package com.company.Lesson6;

abstract class Card {
    protected int numberCard;
    protected int pinCode;
    protected int balans;
    protected String name;

    public int getNumberCard() {
        return numberCard;
    }

    public int getPinCode() {
        return pinCode;
    }

    public int getBalans() {
        return balans;
    }

    public String getName() {
        return name;
    }

    public void setBalans(int balans) {
        this.balans = balans;
    }

}
