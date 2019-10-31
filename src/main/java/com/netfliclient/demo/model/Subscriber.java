package com.netfliclient.demo.model;

public class Subscriber {
    private int id;
    private String identificationNumber;
    private String fullName;

    public Subscriber(String identificationNumber, String fullName) {
        this.identificationNumber = identificationNumber;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
