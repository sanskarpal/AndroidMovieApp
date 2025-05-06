package com.example.movieapp.serviceapi;

import com.example.movieapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {
    //The service interface defines the structure and behavior of the API requests.
    //Acts as a bridge between your app and the API

   //Adding endpoint
    @GET("movie/popular")
    //Call<ResponseType>: represents network request and its reponse. ResponseType should be replaced
    //with actual model data class that represents the expected response from the API
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);
}
