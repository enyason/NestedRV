package com.nexdev.enyason.nestedrv.Model;

/**
 * Created by enyason on 10/7/18.
 */

public class HomeBodyResponse {

    String status;
    HomeData data;

    public HomeBodyResponse(String status, HomeData data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public HomeData getData() {
        return data;
    }
}
