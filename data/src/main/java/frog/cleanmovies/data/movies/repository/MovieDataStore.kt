package frog.cleanmovies.data.movies.repository

import frog.cleanmovies.data.movies.model.DiscoverMovieEntity
import frog.cleanmovies.data.movies.model.DiscoverMovieRequestEntity
import io.reactivex.Single

interface MovieDataStore {
    fun discoverMovies(request: DiscoverMovieRequestEntity) : Single<DiscoverMovieEntity>
}