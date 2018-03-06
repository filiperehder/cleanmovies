package frog.cleanmovies.api.movies

import frog.cleanmovies.api.ApiService
import frog.cleanmovies.api.BuildConfig
import frog.cleanmovies.api.movies.mapper.toDiscoverMovie
import frog.cleanmovies.data.movies.model.DiscoverMovieEntity
import frog.cleanmovies.data.movies.model.DiscoverMovieRequestEntity
import frog.cleanmovies.data.movies.repository.MovieApi
import io.reactivex.Single
import javax.inject.Inject

class MovieApiImpl @Inject constructor(private val apiService: ApiService) : MovieApi {

    override fun discoverMovies(request: DiscoverMovieRequestEntity): Single<DiscoverMovieEntity> {
        return apiService.discoverMovie(BuildConfig.TMDB_API_KEY, request.page, request.year, request.language).map {
            it.toDiscoverMovie()
        }
    }

}