package frog.cleanmovies.domain.movies.repository

import frog.cleanmovies.domain.movies.model.MovieItem
import frog.cleanmovies.domain.movies.model.MovieRequest
import io.reactivex.Single

interface MovieRepository {
    fun discoverMovie(request: MovieRequest) : Single<List<MovieItem>>
}