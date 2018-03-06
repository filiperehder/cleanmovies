package frog.cleanmovies.data.movies

import frog.cleanmovies.data.movies.mapper.toDiscoverMovieRequestEntity
import frog.cleanmovies.data.movies.mapper.toMovieEntity
import frog.cleanmovies.data.movies.source.MovieApiDataStore
import frog.cleanmovies.domain.movies.model.MovieItem
import frog.cleanmovies.domain.movies.model.MovieRequest
import frog.cleanmovies.domain.movies.repository.MovieRepository
import io.reactivex.Single

class MovieDataRepository(private val movieApiDataStore: MovieApiDataStore) : MovieRepository {

    override fun discoverMovie(request: MovieRequest): Single<List<MovieItem>> {
        return movieApiDataStore.discoverMovies(request.toDiscoverMovieRequestEntity()).map {
            it.results.map {
                it.toMovieEntity()
            }
        }
    }
}