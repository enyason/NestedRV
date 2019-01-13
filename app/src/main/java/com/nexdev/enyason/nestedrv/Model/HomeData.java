package com.nexdev.enyason.nestedrv.Model;

import java.util.List;

/**
 * Created by enyason on 10/7/18.
 */

public class HomeData {


    List<Data> data;
    List<Movie> top;


    public HomeData(List<Data> data, List<Movie> top) {
        this.data = data;
        this.top = top;
    }


    public List<Data> getData() {
        return data;
    }

    public List<Movie> getTop() {
        return top;
    }



}
