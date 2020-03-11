package com.company;

public class GoldCard extends BankCard{
    Status status;

    public GoldCard(int numberCard, int pinCode, int balans, String name, Status status) {
        super(numberCard, pinCode, balans, name);
        this.status = status;
    }

    public GoldCard(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GoldCard{" +
                "status=" + status +
                ", numberCard=" + numberCard +
                ", pinCode=" + pinCode +
                ", balans=" + balans +
                ", name='" + name + '\'' +
                '}';
    }
}
