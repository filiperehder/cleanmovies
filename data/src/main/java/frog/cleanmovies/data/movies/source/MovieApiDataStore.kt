package frog.cleanmovies.data.movies.source

import frog.cleanmovies.data.movies.model.DiscoverMovieEntity
import frog.cleanmovies.data.movies.model.DiscoverMovieRequestEntity
import frog.cleanmovies.data.movies.repository.MovieApi
import frog.cleanmovies.data.movies.repository.MovieDataStore
import io.reactivex.Single
import javax.inject.Inject

class MovieApiDataStore @Inject constructor(private val movieApi: MovieApi) : MovieDataStore {

    override fun discoverMovies(request: DiscoverMovieRequestEntity): Single<DiscoverMovieEntity> {
        return movieApi.discoverMovies(request)
    }
}