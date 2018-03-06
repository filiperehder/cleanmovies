package frog.cleanmovies.api.movies.mapper

import frog.cleanmovies.api.movies.model.DiscoverMovieRequest
import frog.cleanmovies.api.movies.model.DiscoverMovieResponse
import frog.cleanmovies.api.movies.model.MovieModel
import frog.cleanmovies.data.movies.model.DiscoverMovieEntity
import frog.cleanmovies.data.movies.model.DiscoverMovieRequestEntity
import frog.cleanmovies.data.movies.model.MovieEntity

fun DiscoverMovieResponse.toDiscoverMovieList() : List<MovieEntity> = results.map {
    it.toMovieEntity()
}

fun DiscoverMovieResponse.toDiscoverMovie() : DiscoverMovieEntity = DiscoverMovieEntity(results = results.map { it.toMovieEntity() })


fun MovieModel.toMovieEntity() = MovieEntity(id, vote_average, title, genre_ids, backdrop_path, overview, release_date, poster_path)

fun DiscoverMovieRequest.toDiscoverMovieRequestEntity() = DiscoverMovieRequestEntity(language, sort_by, include_adult, page, year)