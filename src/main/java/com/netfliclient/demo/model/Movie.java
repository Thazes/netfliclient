package com.netfliclient.demo.model;

public class Movie {
    private int id;
    private int yearofRelease;
    private String movieName;
    private String contentOwner;
    private String classification;  //category
    private String type;            //original or suggested

    public Movie(int id, int yearofRelease, String movieName, String contentOwner, String classification, String type) {
        this.id = id;
        this.yearofRelease = yearofRelease;
        this.movieName = movieName;
        this.contentOwner = contentOwner;
        this.classification = classification;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearofRelease() {
        return yearofRelease;
    }

    public void setYearofRelease(int yearofRelease) {
        this.yearofRelease = yearofRelease;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getContentOwner() {
        return contentOwner;
    }

    public void setContentOwner(String contentOwner) {
        this.contentOwner = contentOwner;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
