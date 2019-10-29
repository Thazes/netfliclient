package com.netfliclient.demo.model;

public class Subscriber {
    private int id;
    private String name;
    private int idNumber;

    public Subscriber(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
