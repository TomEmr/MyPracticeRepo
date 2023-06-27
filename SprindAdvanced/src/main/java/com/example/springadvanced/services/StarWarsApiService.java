package com.example.springadvanced.services;

import com.example.springadvanced.models.MovieDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface StarWarsApiService {

    @GET("films/{id}")
    Call<MovieDTO> getMovie(@Path("id") int movieId);

    @GET("films")
    Call<List<MovieDTO>> getAllMovies();
}
