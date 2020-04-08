package com.company.Lesson6;

public enum Status {
    GOLD(1,"Super"),
    PLATINA(2,"Wow");

    int id;
    String status;

    Status(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}
