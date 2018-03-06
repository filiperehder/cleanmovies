package frog.cleanmovies.data.movies.mapper

import frog.cleanmovies.data.movies.model.DiscoverMovieEntity
import frog.cleanmovies.data.movies.model.DiscoverMovieRequestEntity
import frog.cleanmovies.data.movies.model.MovieEntity
import frog.cleanmovies.domain.movies.model.MovieItem
import frog.cleanmovies.domain.movies.model.MovieRequest

fun MovieRequest.toDiscoverMovieRequestEntity() : DiscoverMovieRequestEntity = DiscoverMovieRequestEntity(language, sort_by, include_adult, page, year)

fun MovieEntity.toMovieEntity() : MovieItem = MovieItem(id, vote_average, title, genre_ids, backdrop_path, overview, release_date, poster_path)

fun DiscoverMovieEntity.toMovieList() : List<MovieItem> = results.map { it.toMovieEntity() }