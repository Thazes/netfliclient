package com.netfliclient.demo.model;

public class Movie {
    private int Movieid;
    private String movieName;  //for recommending movies
    private String movieCategory;

    public Movie(int movieid, String movieName, String movieCategory) {
        Movieid = movieid;
        this.movieName = movieName;
        this.movieCategory = movieCategory;
    }

    public int getMovieid() {
        return Movieid;
    }

    public void setMovieid(int movieid) {
        Movieid = movieid;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }
}
