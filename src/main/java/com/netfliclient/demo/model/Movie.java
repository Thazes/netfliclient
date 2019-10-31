package com.netfliclient.demo.model;

import java.util.List;

public class Movie {
    private int id;
    private String name;
    private String type;
    private String yearOfRelease;
    private Subscriber contentOwner;
    private List<Category> categories;

    public Movie(String name, String type, String yearOfRelease, Subscriber contentOwner, List<Category> categories) {
        this.name = name;
        this.type = type;
        this.yearOfRelease = yearOfRelease;
        this.contentOwner = contentOwner;
        this.categories = categories;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Subscriber getContentOwner() {
        return contentOwner;
    }

    public void setContentOwner(Subscriber contentOwner) {
        this.contentOwner = contentOwner;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
