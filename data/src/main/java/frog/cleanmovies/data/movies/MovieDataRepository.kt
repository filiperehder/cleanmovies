package frog.cleanmovies.data.movies

import frog.cleanmovies.data.movies.mapper.toDiscoverMovieRequestEntity
import frog.cleanmovies.data.movies.mapper.toMovieItemList
import frog.cleanmovies.data.movies.source.MovieApiDataStore
import frog.cleanmovies.domain.movies.model.MovieItem
import frog.cleanmovies.domain.movies.model.MovieRequest
import frog.cleanmovies.domain.movies.repository.MovieRepository
import io.reactivex.Single
import javax.inject.Inject

class MovieDataRepository @Inject constructor(private val movieApiDataStore: MovieApiDataStore) : MovieRepository {

    override fun discoverMovie(request: MovieRequest): Single<List<MovieItem>> {
        return movieApiDataStore.discoverMovies(request.toDiscoverMovieRequestEntity()).map {
            it.toMovieItemList()
        }
    }
}