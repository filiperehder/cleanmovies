package frog.cleanmovies.api

import frog.cleanmovies.api.movies.model.DiscoverMovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("discover/movie")
    fun discoverMovie(@Query("api_key") apiKey: String,
                      @Query("page") page: Int,
                      @Query("year") year: String,
                      @Query("language") language: String) : Single<DiscoverMovieResponse>
}