package com.nexdev.enyason.nestedrv.Api;

import com.nexdev.enyason.nestedrv.Model.HomeBodyResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by enyason on 10/3/18.
 */

public interface RetrofitApiClient {


    @GET("/response.json")
    Call<HomeBodyResponse> getMovieByCategory();


}
