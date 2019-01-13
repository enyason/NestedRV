package com.nexdev.enyason.nestedrv.Model;

import java.util.List;

/**
 * Created by enyason on 10/7/18.
 */

public class HomeData {


    List<Data> data;

    public HomeData(List<Data> data) {
        this.data = data;
    }


    public List<Data> getData() {
        return data;
    }
}
