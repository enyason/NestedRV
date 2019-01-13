package com.nexdev.enyason.nestedrv.Model;


import java.util.List;

/**
 * Created by enyason on 10/7/18.
 */

public class Data {

    List<Movie> list;
    String genre;
    String type;

    public Data(List<Movie> list, String genre, String type) {
        this.list = list;
        this.genre = genre;
        this.type = type;
    }

    public List<Movie> getList() {
        return list;
    }

    public String getGenre() {
        return genre;
    }

    public String getType() {
        return type;
    }
}
