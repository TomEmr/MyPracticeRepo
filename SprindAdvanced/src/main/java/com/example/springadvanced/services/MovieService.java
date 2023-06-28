package com.example.springadvanced.services;

import com.example.springadvanced.config.RetrofitConfig;
import com.example.springadvanced.models.Movie;
import com.example.springadvanced.models.MovieDTO;
import com.example.springadvanced.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

@Service
public class MovieService {

    private final Retrofit retrofit;
    private final MovieRepository movieRepository;
    private final StarWarsApiService starWarsApiService;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
        this.retrofit = RetrofitConfig.getRetrofit();
        this.starWarsApiService = retrofit.create(StarWarsApiService.class);
    }

    public Movie getMovieById(int movieId) throws IOException {
        Call<MovieDTO> call = starWarsApiService.getMovie(movieId);
        Response<MovieDTO> response = call.execute();
        if (response.isSuccessful()) {
                Movie movie = new Movie(response.body());
                movieRepository.save(movie);
                return movie;
        } else {
            throw new IOException("Error: There is no response");
        }
    }

}
