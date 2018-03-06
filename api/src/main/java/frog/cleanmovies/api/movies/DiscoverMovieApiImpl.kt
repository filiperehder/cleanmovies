package frog.cleanmovies.api.movies

import frog.cleanmovies.api.ApiService
import frog.cleanmovies.api.movies.mapper.toDiscoverMovie
import frog.cleanmovies.data.movies.model.DiscoverMovieEntity
import frog.cleanmovies.data.movies.model.DiscoverMovieRequestEntity
import frog.cleanmovies.data.movies.repository.DiscoverMovieApi
import io.reactivex.Single
import javax.inject.Inject

class DiscoverMovieApiImpl @Inject constructor(private val apiService: ApiService) : DiscoverMovieApi {

    override fun discoverMovies(request: DiscoverMovieRequestEntity): Single<DiscoverMovieEntity> {
        return apiService.discoverMovie("", request.page, request.year, request.language).map {
            it.toDiscoverMovie()
        }
    }

}