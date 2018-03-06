package frog.cleanmovies.api.mapper

import frog.cleanmovies.api.model.DiscoverMovieRequest
import frog.cleanmovies.api.model.DiscoverMovieResponse
import frog.cleanmovies.api.model.MovieModel
import frog.cleanmovies.data.model.DiscoverMovieRequestEntity
import frog.cleanmovies.data.model.MovieEntity

fun DiscoverMovieResponse.toDiscoverMovieEntity() : List<MovieEntity> = results.map {
    it.toMovieEntity()
}

fun MovieModel.toMovieEntity() = MovieEntity(id, vote_average, title, genre_ids, backdrop_path, overview, release_date, poster_path)

fun DiscoverMovieRequest.toDiscoverMovieRequestEntity() = DiscoverMovieRequestEntity(language, sort_by, include_adult, page, year)