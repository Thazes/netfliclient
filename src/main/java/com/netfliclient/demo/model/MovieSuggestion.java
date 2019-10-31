package com.netfliclient.demo.model;

import java.util.List;

public class MovieSuggestion {
    private String name;
    private String yearOfRelease;
    private List<Category> categories;

    public MovieSuggestion(String name, String yearOfRelease, List<Category> categories) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
