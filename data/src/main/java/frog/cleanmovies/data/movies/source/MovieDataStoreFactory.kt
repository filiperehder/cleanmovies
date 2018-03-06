package frog.cleanmovies.data.movies.source

import frog.cleanmovies.data.movies.repository.MovieDataStore
import javax.inject.Inject

class MovieDataStoreFactory @Inject constructor(private val movieApi: MovieApiDataStore) {

    fun retrieveMovieApiDataStore() : MovieDataStore {
        return movieApi
    }
}